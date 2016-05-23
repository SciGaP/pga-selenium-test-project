package org.apache.airavata.pga.tests;

import org.apache.airavata.pga.tests.utils.UserLogin;
import org.junit.Before;
import org.junit.Test;

/*
 **********Executing All Tests on Airavata Applications**********
 * Created by Eroma on 4/26/15.
 * The script is to execute all aApplication experiments as a bundle.
 * Updated to work with Latest PGA by Eroma 08/05/2015.
*/
public class RunAllTests extends UserLogin {
    @Before
    public void setUp() throws Exception {}

    @Test
    public void runAll() throws Exception {
        System.out.println("============== Running all tests ==================");

        long startTime = System.nanoTime();

//       System.out.println("Starting CreateModifySearchProject ...");
//        CreateModifySearchProject t0 = new CreateModifySearchProject();
//        t0.setUp();
//        t0.testCreateModifySearchProject();
//        t0.tearDown();
//        System.out.println("CreateModifySearchProject - Done");

        int iterations1 = 1;
        for (int i=0; i < iterations1; ++i) {

        System.out.println("Starting AbaqusComet ...");
        AbaqusComet t1 = new AbaqusComet();
        t1.setUp();
        t1.testAbaqusComet();
        t1.tearDown();
        System.out.println("AbaqusComet - Done");

        System.out.println("Starting AbinitBR2 ...");
        AbinitBR2 t2 = new AbinitBR2();
        t2.setUp();
        t2.testAbinitBR2();
        t2.tearDown();
        System.out.println("AbinitBR2 - Done");

        System.out.println("Starting AbinitBridges ...");
        AbinitBridges t3 = new AbinitBridges();
        t3.setUp();
        t3.testAbinitBridges();
        t3.tearDown();
        System.out.println("AbinitBridges - Done");

        System.out.println("Starting AbinitComet ...");
        AbinitComet t4 = new AbinitComet();
        t4.setUp();
        t4.testAbinitComet();
        t4.tearDown();
        System.out.println("AbinitComet - Done");

        System.out.println("Starting AmberSanderBR2 ...");
        AmberSanderBR2 t5 = new AmberSanderBR2();
        t5.setUp();
        t5.testAmberSanderBR2();
        t5.tearDown();
        System.out.println("AmberSanderBR2 - Done");

        System.out.println("Starting AmberSanderComet ...");
        AmberSanderComet t6 = new AmberSanderComet();
        t6.setUp();
        t6.testAmberSanderComet();
        t6.tearDown();
        System.out.println("AmberSanderComet - Done");

        System.out.println("Starting AmberSanderStampede ...");
        AmberSanderStampede t7 = new AmberSanderStampede();
        t7.setUp();
        t7.testAmberSanderStampede();
        t7.tearDown();
        System.out.println("AmberSanderStampede - Done");

        System.out.println("Starting AutoDockBR2 ...");
        AutoDockBR2 t8 = new AutoDockBR2();
        t8.setUp();
        t8.testAutoDockBR2();
        t8.tearDown();
        System.out.println("AutoDockBR2 - Done");

        System.out.println("Starting AutoDockKarst ...");
        AutoDockKarst t9 = new AutoDockKarst();
        t9.setUp();
        t9.testAutoDockKarst();
        t9.tearDown();
        System.out.println("AutoDockKarst - Done");

        System.out.println("Starting AutoDockVinaStampede ...");
        AutoDockVinaStampede t10 = new AutoDockVinaStampede();
        t10.setUp();
        t10.testAutoDockVinaStampede();
        t10.tearDown();
        System.out.println("AutoDockVinaStampede - Done");

        System.out.println("Starting CP2KComet ...");
        CP2KComet t11 = new CP2KComet();
        t11.setUp();
        t11.testCP2KComet();
        t11.tearDown();
        System.out.println("CP2KComet - Done");

        System.out.println("Starting CP2KStampede ...");
        CP2KStampede t12 = new CP2KStampede();
        t12.setUp();
        t12.testCP2KStampede();
        t12.tearDown();
        System.out.println("CP2KStampede - Done");

        System.out.println("Starting CPMDComet ...");
        CPMDComet t13 = new CPMDComet();
        t13.setUp();
        t13.testCPMDComet();
        t13.tearDown();
        System.out.println("CPMDComet - Done");

        System.out.println("Starting DDSCatComet ...");
        DDSCatComet t14 = new DDSCatComet();
        t14.setUp();
        t14.testDDSCatComet();
        t14.tearDown();
        System.out.println("DDSCatComet - Done");

        System.out.println("Starting DFTBStampede ...");
        DFTBStampede t15 = new DFTBStampede();
        t15.setUp();
        t15.testDFTBStampede();
        t15.tearDown();
        System.out.println("DFTBStampede - Done");

        System.out.println("Starting GamessBR2 ...");
        GamessBR2 t16 = new GamessBR2();
        t16.setUp();
        t16.testGamessBR2();
        t16.tearDown();
        System.out.println("GamessBR2 - Done");

        System.out.println("Starting GamessComet ...");
        GamessComet t17 = new GamessComet();
        t17.setUp();
        t17.testGamessComet();
        t17.tearDown();
        System.out.println("GamessComet - Done");

        System.out.println("Starting GamessGordon ...");
        GamessGordon t18 = new GamessGordon();
        t18.setUp();
        t18.testGamessGordon();
        t18.tearDown();
        System.out.println("GamessGordon - Done");

        System.out.println("Starting GamessKarst ...");
        GamessKarst t19 = new GamessKarst();
        t19.setUp();
        t19.testGamessKarst();
        t19.tearDown();
        System.out.println("GamessKarst - Done");

        System.out.println("Starting GamessStampede ...");
        GamessStampede t20 = new GamessStampede();
        t20.setUp();
        t20.testGamessStampede();
        t20.tearDown();
        System.out.println("GamessStampede - Done");

        System.out.println("Starting GaussianBR2 ...");
        GaussianBR2 t21 = new GaussianBR2();
        t21.setUp();
        t21.testGaussianBR2();
        t21.tearDown();
        System.out.println("GaussianBR2 - Done");

        System.out.println("Starting GaussianBridges ...");
        GaussianBridges t22 = new GaussianBridges();
        t22.setUp();
        t22.testGaussianBridges();
        t22.tearDown();
        System.out.println("GaussianBridges - Done");

        System.out.println("Starting GaussianComet ...");
        GaussianComet t23 = new GaussianComet();
        t23.setUp();
        t23.testGaussianComet();
        t23.tearDown();
        System.out.println("GaussianComet - Done");

        System.out.println("Starting GaussianGordon ...");
        GaussianGordon t24 = new GaussianGordon();
        t24.setUp();
        t24.testGaussianGordon();
        t24.tearDown();
        System.out.println("GaussianGordon - Done");

        System.out.println("Starting GaussianKarst ...");
        GaussianKarst t25 = new GaussianKarst();
        t25.setUp();
        t25.testGaussianKarst();
        t25.tearDown();
        System.out.println("GaussianKarst - Done");

        System.out.println("Starting GromacsBR2 ...");
        GromacsBR2 t26 = new GromacsBR2();
        t26.setUp();
        t26.testGromacsBR2();
        t26.tearDown();
        System.out.println("GromacsBR2 - Done");

        System.out.println("Starting GromacsComet ...");
        GromacsComet t27 = new GromacsComet();
        t27.setUp();
        t27.testGromacsComet();
        t27.tearDown();
        System.out.println("GromacsComet - Done");

        System.out.println("Starting GromacsKarst ...");
        GromacsKarst t28 = new GromacsKarst();
        t28.setUp();
        t28.testGromacsKarst();
        t28.tearDown();
        System.out.println("GromacsKarst - Done");

        System.out.println("Starting GromacsStampede ...");
        GromacsStampede t29 = new GromacsStampede();
        t29.setUp();
        t29.testGromacsStampede();
        t29.tearDown();
        System.out.println("GromacsStampede - Done");

        System.out.println("Starting LammpsBR2 ...");
        LammpsBR2 t30 = new LammpsBR2();
        t30.setUp();
        t30.testLammpsBR2();
        t30.tearDown();
        System.out.println("LammpsBR2 - Done");

        System.out.println("Starting LammpsComet ...");
        LammpsComet t31 = new LammpsComet();
        t31.setUp();
        t31.testLammpsComet();
        t31.tearDown();
        System.out.println("LammpsComet - Done");

        System.out.println("Starting LammpsGordon ...");
        LammpsGordon t32 = new LammpsGordon();
        t32.setUp();
        t32.testLammpsGordon();
        t32.tearDown();
        System.out.println("LammpsGordon - Done");

        System.out.println("Starting LammpsKarst ...");
        LammpsKarst t33 = new LammpsKarst();
        t33.setUp();
        t33.testLammpsKarst();
        t33.tearDown();
        System.out.println("LammpsKarst - Done");

        System.out.println("Starting LammpsStampede ...");
        LammpsStampede t34 = new LammpsStampede();
        t34.setUp();
        t34.testLammpsStampede();
        t34.tearDown();
        System.out.println("LammpsStampede - Done");

        System.out.println("Starting MolcasStampede ...");
        MolcasStampede t35 = new MolcasStampede();
        t35.setUp();
        t35.testMolcasStampede();
        t35.tearDown();
        System.out.println("MolcasStampede - Done");

        System.out.println("Starting NEK5000BR2 ...");
        NEK5000BR2 t36 = new NEK5000BR2();
        t36.setUp();
        t36.testNEK5000BR2();
        t36.tearDown();
        System.out.println("NEK5000BR2 - Done");

        System.out.println("Starting NwChemComet ...");
        NwChemComet t37 = new NwChemComet();
        t37.setUp();
        t37.testNwChemComet();
        t37.tearDown();
        System.out.println("NwChemComet - Done");

        System.out.println("Starting NwChemStampede ...");
        NwChemStampede t38 = new NwChemStampede();
        t38.setUp();
        t38.testNwChemStampede();
        t38.tearDown();
        System.out.println("NwChemStampede - Done");

        System.out.println("Starting PhastaPStampede ...");
        PhastaPStampede t39 = new PhastaPStampede();
        t39.setUp();
        t39.testPhastaPStampede();
        t39.tearDown();
        System.out.println("PhastaPStampede - Done");

        System.out.println("Starting QChemComet ...");
        QChemComet t40 = new QChemComet();
        t40.setUp();
        t40.testQChemComet();
        t40.tearDown();
        System.out.println("QChemComet - Done");

        System.out.println("Starting QuantumEspressoBridges ...");
        QuantumEspressoBridges t41 = new QuantumEspressoBridges();
        t41.setUp();
        t41.testQuantumEspressoBridges();
        t41.tearDown();
        System.out.println("QuantumEspressoBridges - Done");

        System.out.println("Starting QuantumEspressoComet ...");
        QuantumEspressoComet t42 = new QuantumEspressoComet();
        t42.setUp();
        t42.testQuantumEspressoComet();
        t42.tearDown();
        System.out.println("QuantumEspressoComet - Done");

        System.out.println("Starting QuantumEspressoStampede ...");
        QuantumEspressoStampede t43 = new QuantumEspressoStampede();
        t43.setUp();
        t43.testQuantumEspressoStampede();
        t43.tearDown();
        System.out.println("QuantumEspressoStampede - Done");

        System.out.println("Starting TinkerMonteStampede ...");
        TinkerMonteStampede t44 = new TinkerMonteStampede();
        t44.setUp();
        t44.testTinkerMonteStampede();
        t44.tearDown();
        System.out.println("TinkerMonteStampede - Done");

        System.out.println("Starting VinaMultipleComet ...");
        VinaMultipleComet t45 = new VinaMultipleComet();
        t45.setUp();
        t45.testVinaMultipleComet();
        t45.tearDown();
        System.out.println("VinaMultipleComet - Done");

        System.out.println("Starting VinaMultipleStampede ...");
        VinaMultipleStampede t46 = new VinaMultipleStampede();
        t46.setUp();
        t46.testVinaMultipleStampede();
        t46.tearDown();
        System.out.println("VinaMultipleStampede - Done");

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Time to execute Experiment Tests "
                + " : " + (duration / 1000000000) / 60 + " minutes.");

        System.out.println("==================== Done =========================");

    }
}
