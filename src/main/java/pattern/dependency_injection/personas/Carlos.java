package pattern.dependency_injection.personas;

import pattern.dependency_injection.interaccion.Estado;

/**
 * {@link Carlos}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Carlos implements Estado
{
    @Override
    public void sonerir(String reason)
    {
        System.out.println("Carlos, esta sonriendo en este momento, porque "+reason);
    }

    @Override
    public void llorar(String reason)
    {
        System.out.println("Carlos, tiene ganas de llorar, porque "+reason);
    }
}
