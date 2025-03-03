package h6;

public abstract class d {
    private static volatile d defaultFactory;

    public static d getDefaultFactory() {
        if (defaultFactory == null) {
            defaultFactory = newDefaultFactory(d.class.getName());
        }
        return defaultFactory;
    }

    public static C1082c getInstance(Class<?> cls) {
        return getInstance(cls.getName());
    }

    private static d newDefaultFactory(String str) {
        d useSlf4JLoggerFactory = useSlf4JLoggerFactory(str);
        if (useSlf4JLoggerFactory != null) {
            return useSlf4JLoggerFactory;
        }
        d useLog4J2LoggerFactory = useLog4J2LoggerFactory(str);
        if (useLog4J2LoggerFactory != null) {
            return useLog4J2LoggerFactory;
        }
        d useLog4JLoggerFactory = useLog4JLoggerFactory(str);
        if (useLog4JLoggerFactory != null) {
            return useLog4JLoggerFactory;
        }
        return useJdkLoggerFactory(str);
    }

    private static d useJdkLoggerFactory(String str) {
        d dVar = f.INSTANCE;
        dVar.newInstance(str).debug("Using java.util.logging as the default logging framework");
        return dVar;
    }

    private static d useLog4J2LoggerFactory(String str) {
        try {
            d dVar = j.INSTANCE;
            dVar.newInstance(str).debug("Using Log4J2 as the default logging framework");
            return dVar;
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    private static d useLog4JLoggerFactory(String str) {
        try {
            d dVar = l.INSTANCE;
            dVar.newInstance(str).debug("Using Log4J as the default logging framework");
            return dVar;
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    private static d useSlf4JLoggerFactory(String str) {
        try {
            d instanceWithNopCheck = p.getInstanceWithNopCheck();
            instanceWithNopCheck.newInstance(str).debug("Using SLF4J as the default logging framework");
            return instanceWithNopCheck;
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    public abstract C1082c newInstance(String str);

    public static C1082c getInstance(String str) {
        return getDefaultFactory().newInstance(str);
    }
}
