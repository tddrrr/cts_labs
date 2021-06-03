package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import tests.TestGrupa;
import tests.TestGrupaStudentFake;
import tests.TestGrupaStudentStub;
import tests.TesteGrupaCuFixture;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaStudentFake.class, TestGrupaStudentStub.class, TesteGrupaCuFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class, TesteUrgente.class})
public class SuitaCustom {

}
