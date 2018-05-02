public class TestRiver {
    River river;
    Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void canAddSalmon(){
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canGetSalmon(){
          river.addFish(salmon);
//        assertEquals(1, river.fishCount());
//        river.removeFish();
//        assertEquals(0, river.fishCount());
        Salmon result = river.removeFish();
        assertNotNull(result);
    }



}
