package doug.test.osgi;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.osgi.baseadaptor.HookConfigurator;
import org.eclipse.osgi.baseadaptor.HookRegistry;
import org.eclipse.osgi.framework.adaptor.BundleClassLoader;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegateHook;

@SuppressWarnings("restriction")
public class JavaFXClassLoaderDelegateHook implements ClassLoaderDelegateHook, HookConfigurator {

	@Override
	public void addHooks(HookRegistry hookRegistry) {
		hookRegistry.addClassLoaderDelegateHook(this);
	}

	@Override
	public Class<?> preFindClass(String name, BundleClassLoader classLoader, BundleData data)
			throws ClassNotFoundException {
		if (name.startsWith("javafx."))
			return java.lang.ClassLoader.getSystemClassLoader().loadClass(name);
		return null;
	}

	@Override
	public Class<?> postFindClass(String name, BundleClassLoader classLoader, BundleData data)
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL preFindResource(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL postFindResource(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<URL> preFindResources(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<URL> postFindResources(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String preFindLibrary(String name, BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postFindLibrary(String name, BundleClassLoader classLoader, BundleData data) {
		// TODO Auto-generated method stub
		return null;
	}

}
