import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
        bannedSites.add("malware.com");
        bannedSites.add("pirated-movies.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied. Site is banned.");
        }
        realInternet.connectTo(serverHost);
    }
}
