package config;



import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigResolveOptions;
import jdk.nashorn.internal.runtime.regexp.joni.Config;


public final class ConfigFactory {
        private ConfigFactory() {
        }


//        public static Config load(String resourceBasename) {
//            return load(resourceBasename, ConfigParseOptions.defaults(), ConfigResolveOptions.defaults());
//        }
////
//        public static Config load(ClassLoader classLoader, Config appConfig, ConfigResolveOptions resolveOptions) {
//            return load(resourceBasename, ConfigParseOptions.defaults().setClassLoader(loader), ConfigResolveOptions.defaults());
//        }
//
//        public static Config load(String resourceBasename, ConfigParseOptions parseOptions, ConfigResolveOptions resolveOptions) {
//            ConfigParseOptions withLoader = ensureClassLoader(parseOptions, "load");
//            Config appConfig = parseResourcesAnySyntax(resourceBasename, withLoader);
//            return load(withLoader.getClassLoader(), appConfig, resolveOptions);
//        }

//        public static Config load(ClassLoader loader, String resourceBasename, ConfigParseOptions parseOptions, ConfigResolveOptions resolveOptions) {
//            return load(resourceBasename, parseOptions.setClassLoader(loader), resolveOptions);
//        }

        private static ClassLoader checkedContextClassLoader(String methodName) {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            if (loader == null) {
                throw new ConfigException.BugOrBroken("Context class loader is not set for the current thread; if Thread.currentThread().getContextClassLoader() returns null, you must pass a ClassLoader explicitly to ConfigFactory." + methodName);
            } else {
                return loader;
            }
        }

}
