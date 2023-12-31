package net.serenitybdd.demos.todos.pageobjects.maintain_my_todo_list;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.demos.todos.pageobjects.model.TodoStatusFilter;
import net.serenitybdd.demos.todos.pageobjects.steps.TodoUserSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
@Tag("PageObjects")
public class FilteringTodos {

    @Managed WebDriver driver;

    @Steps(shared = true)
    TodoUserSteps james;

    @Test
    public void should_be_able_to_view_only_completed_todos_with_page_objects() {

        james.starts_with_a_todo_list_containing("Walk the dog", "Put out the garbage");

        james.completes("Walk the dog");

        james.filters_items_to_show(TodoStatusFilter.Completed);

        james.should_see_that_displayed_items_contain("Walk the dog");
        james.should_see_that_displayed_items_do_not_contain("Put out the garbage");
        james.should_see_that_the_currently_selected_filter_is(TodoStatusFilter.Completed);
    }

    @Test
    public void should_be_able_to_view_only_incomplete_todos_with_page_objects() {

        james.starts_with_a_todo_list_containing("Walk the dog", "Put out the garbage");

        james.completes("Walk the dog");

        james.filters_items_to_show(TodoStatusFilter.Active);

        james.should_see_that_displayed_items_contain("Put out the garbage");
        james.should_see_that_displayed_items_do_not_contain("Walk the dog");
        james.should_see_that_the_currently_selected_filter_is(TodoStatusFilter.Active);
    }

    @Test
    public void should_be_able_to_view_both_complete_and_incomplete_todos_with_page_objects() {

        james.starts_with_a_todo_list_containing("Walk the dog", "Put out the garbage");

        james.completes("Walk the dog");

        james.filters_items_to_show(TodoStatusFilter.Active);

        james.filters_items_to_show(TodoStatusFilter.All);

        james.should_see_that_displayed_items_contain("Walk the dog", "Put out the garbage");
        james.should_see_that_the_currently_selected_filter_is(TodoStatusFilter.All);
    }
}
