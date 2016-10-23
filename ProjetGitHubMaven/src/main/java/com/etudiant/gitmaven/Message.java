package com.etudiant.gitmaven;

import java.util.Random;

public class Message 
{
	private static String[] tbMessages = {
			"Bonjour %%",
			"Comment allez-vous %% ?",
			"Ca va %% ?",
			"Vous avez bonne mine %% aujourd'hui !"
	};
	
	public String getMessage(String nom)
	{
		Random rnd = new Random();
		String msg = tbMessages[rnd.nextInt(tbMessages.length)];
		
		return msg.replaceFirst("%%", nom);
	}
}

