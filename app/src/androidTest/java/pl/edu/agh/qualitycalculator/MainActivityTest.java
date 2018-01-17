package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
       }
    @Test
    public void testMulti(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testSub(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testAvg(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnSre)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testDiv(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testSumSum(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 plus 4.0 gives value 12.0")));
    }
    @Test
    public void testMultiMulti(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 multiplied by 4.0 multiplied by 4.0 gives value 64.0")));
    }
    @Test
    public void testDivDiv(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("1.0 divided by 1.0 divided by 1.0 gives value 1.0")));
    }

    @Test
    public void testSubSub(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("1.0 minus 1.0 minus 1.0 gives value -1.0")));
    }

    @Test
    public void testAVGAVG(){


        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("1"));
        onView(withId(R.id.btnSre)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Avg from: 1.0 ,1.0 ,1.0 , gives value 1.0")));
    }
}

