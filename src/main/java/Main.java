class Main {
    public static void main (String[] args){
        int accRigidite = 0;

        App app1 = new App(56);
        App app2 = new App(13);

        Rigidite myRigidite = new Rigidite();
        myRigidite.addApp(app1);
        myRigidite.addApp(app2);



        double all = myRigidite.getAllRigidite();

        for(int i = 0; i<5;i++){
            int rig1 = app1.getAppRigidite();
            int rig2 = app2.getAppRigidite();

            rig1 += 5;rig2 += 5;

            app1.set_rigidite(rig1);
            app2.set_rigidite(rig2);

            all = myRigidite.getAllRigidite();

            System.out.println("rigidite  app1");
            System.out.println(app1.getAppRigidite());
            System.out.println("rigidite  app2");
            System.out.println(app2.getAppRigidite());
            System.out.println("rigidite all app");
            System.out.println(all);
        }

    }
}
