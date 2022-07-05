package ase.cts.g1088.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet ip=new InternetProvider();
    private List<String> blackList=new ArrayList<>();

    public ProxyInternet(){
        blackList.add("facebook");
        blackList.add("tiktok");
        blackList.add("instagram");
    }

    @Override
    public void connectToUrl(String url) {
        if(blackList.contains(url)){
            System.out.println("Acces interzis");
        }else{
            ip.connectToUrl(url);
        }
    }
}
