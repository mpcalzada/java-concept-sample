package pattern.dependency_injection;

import pattern.dependency_injection.interaccion.Chat;
import pattern.dependency_injection.interaccion.Estado;
import pattern.dependency_injection.personas.Angel;
import pattern.dependency_injection.personas.Carlos;
import pattern.dependency_injection.personas.Marco;

/**
 * {@link Start}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Start
{
    public static void start()
    {
        Estado persona = new Marco();
        Chat chat = new Chat(persona);

        chat.enviarMensaje("Te odio, nunca vuelvas a buscar", Chat.MOOD.SAD);
        chat.enviarMensaje("Mentí, yo te amo, ven a casa", Chat.MOOD.HAPPY);
    }
}
