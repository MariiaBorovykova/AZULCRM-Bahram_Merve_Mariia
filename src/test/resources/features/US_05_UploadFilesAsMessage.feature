Feature: User should be able to upload files and pictures as messages

@US05
  Scenario Outline: Verify that the user can upload files and pictures.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user click on "Upload files"
    And user upload the "<file>"
    Then user click on Send button
    Then user can see created post with "<file>" name
    Examples:
      | user type      | file           |
      | Helpdesk user  | DOCX_File.docx |
      | Marketing user | DOCX_File.docx |
      | HR user        | DOCX_File.docx |
      | Helpdesk user  | PDF_File.pdf   |
      | Marketing user | PDF_File.pdf   |
      | HR user        | PDF_File.pdf   |
      | Helpdesk user  | TXT_File.txt   |
      | Marketing user | TXT_File.txt   |
      | HR user        | TXT_File.txt   |
      | Helpdesk user  | JPG_File.jpg   |
      | Marketing user | JPG_File.jpg   |
      | HR user        | JPG_File.jpg   |
      | Helpdesk user  | PNG_File.png   |
      | Marketing user | PNG_File.png   |
      | HR user        | PNG_File.png   |

  Scenario Outline: Verify that the user can insert the files and images into the text.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user can write "Message with file" in the Message title field
    Then user click on "Upload files"
    And user upload the "<file>"
    Then user click on Insert in text button
    Then user click on Send button
    And user can see created post with "<file>" name
    Examples:
      | user type      | file           |
      | Helpdesk user  | DOCX_File.docx |
      | Marketing user | DOCX_File.docx |
      | HR user        | DOCX_File.docx |
      | Helpdesk user  | PDF_File.pdf   |
      | Marketing user | PDF_File.pdf   |
      | HR user        | PDF_File.pdf   |
      | Helpdesk user  | TXT_File.txt   |
      | Marketing user | TXT_File.txt   |
      | HR user        | TXT_File.txt   |
      | Helpdesk user  | JPG_File.jpg   |
      | Marketing user | JPG_File.jpg   |
      | HR user        | JPG_File.jpg   |
      | Helpdesk user  | PNG_File.png   |
      | Marketing user | PNG_File.png   |
      | HR user        | PNG_File.png   |
  @US12
  Scenario Outline: Verify that the user can remove files and images at any time before sending.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user can write "Message without file" in the Message title field
    Then user click on "Upload files"
    And user upload the "<file>"
    Then user click on Insert in text button
    Then user click on Delete from text button
    Then user click on Send button
    Then user can see created post with Message title "Message without file "
    Examples:
      | user type      | file           |
      #| Helpdesk user  | PNG_File.png   |
      #| Marketing user | PNG_File.png   |
      #| HR user        | PNG_File.png   |
      | Helpdesk user  | DOCX_File.docx |
      | Marketing user | DOCX_File.docx |
      | HR user        | DOCX_File.docx |
      | Helpdesk user  | PDF_File.pdf   |
      | Marketing user | PDF_File.pdf   |
      | HR user        | PDF_File.pdf   |
      | Helpdesk user  | TXT_File.txt   |
      | Marketing user | TXT_File.txt   |
      | HR user        | TXT_File.txt   |
      | Helpdesk user  | JPG_File.jpg   |
      | Marketing user | JPG_File.jpg   |
      | HR user        | JPG_File.jpg   |
