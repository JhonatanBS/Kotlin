package com.example.motivation.repository

import com.example.motivation.helper.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val category: Int)

class PhraseRepository {
    private val happy = MotivationConstants.PHRASE.HAPPY
    private val sunny = MotivationConstants.PHRASE.SUNNY
    private val all = MotivationConstants.PHRASE.ALL

    private val listPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getPhrase(filter: Int): String {
        val filtered = listPhrases.filter { it.category == filter || filter == all }
        val rand = Random.nextInt(filtered.size)
        return filtered[rand].description
    }
}