package com.rule.drools;
//
//import java.io.IOException;
//
//import org.kie.api.KieServices;
//import org.kie.api.builder.KieBuilder;
//import org.kie.api.builder.KieFileSystem;
//import org.kie.api.builder.KieModule;
//import org.kie.api.builder.KieRepository;
//import org.kie.api.builder.ReleaseId;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.io.ResourceFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DroolConfig {
//
//    private KieServices kieServices = KieServices.Factory.get();
//
//    private KieFileSystem getKieFileSystem() throws IOException {
//        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource("smartphone.drl"));
//        return kieFileSystem;
//
//    }
//
//    @Bean
//    public KieContainer getKieContainer() throws IOException {
//        System.out.println("Container created...");
//        getKieRepository();
//        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
//        kb.buildAll();
//        KieModule kieModule = kb.getKieModule();
//        KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//        return kContainer;
//
//    }
//
//    private void getKieRepository() {
//        final KieRepository kieRepository = kieServices.getRepository();
//        kieRepository.addKieModule(new KieModule() {
//            public ReleaseId getReleaseId() {
//                return kieRepository.getDefaultReleaseId();
//            }
//        });
//    }
//
//    @Bean
//    public KieSession getKieSession() throws IOException {
//        System.out.println("session created...");
//        return getKieContainer().newKieSession();
//
//    }
//
//}
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolConfig {

    private static final String drl_file_path = "smartphone.drl";

    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(drl_file_path));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }
}
