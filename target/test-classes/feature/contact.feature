Feature: Create a new contact and edit the name once is created
Data:
First Name: Bring
Last Name: Digital
Mobile Number: +351911111111
Change to: Other
Phone: +351911111111
Change to: Other fax
Email: Sonia.pereira@bringglobal.com
Change to: Work

Background:
    Given I enter to the application

Scenario: Create contact and edit
    When I click in add new contact
     * I add the photo
    Then I see form to create a contact
    When I enter the information required to create a contact
        |Bring    |Digital |+351911111111| Other  |+351911111111| Other fax| Sonia.pereira@bringglobal.com| Work|
    Then I validate the contact is created
    When I click in edit contact
    And I enter all the information required to edit contact
        |Bring Global|
    Then I validate the contact is updated

