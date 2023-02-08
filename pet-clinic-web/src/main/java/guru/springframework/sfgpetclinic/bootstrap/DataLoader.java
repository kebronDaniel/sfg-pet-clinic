package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.VetService;
import guru.springframework.sfgpetclinic.service.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Kebron");
        owner1.setLastName("Daniel");
        ownerService.save(owner1);
        System.out.println("Saved owner called " + owner1.getFirstName());

        Owner owner2 = new Owner();
        owner2.setFirstName("Sivan");
        owner2.setLastName("Daniel");
        ownerService.save(owner2);
        System.out.println("Saved Owner called " + owner2.getFirstName());


        Vet vet1 = new Vet();
        vet1.setFirstName("Luka");
        vet1.setLastName("Modric");
        vetService.save(vet1);
        System.out.println("Saved vet called " + vet1.getFirstName());

        Vet vet2 = new Vet();
        vet2.setFirstName("Theo");
        vet2.setLastName("Hernandez");
        vetService.save(vet2);
        System.out.println("Saved a vet called " + vet2.getFirstName());


    }
}
