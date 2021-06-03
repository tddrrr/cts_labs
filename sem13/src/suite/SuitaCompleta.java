package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestGrupa;
import tests.TestGrupaStudentFake;
import tests.TestGrupaStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaStudentFake.class, TestGrupaStudentStub.class, TestGrupa.class})
public class SuitaCompleta {

}
