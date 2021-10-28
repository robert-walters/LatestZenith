package StepDefinitions;

import PageObjects.Blockers.FECandidateViewActivityActivityFilterPage;
import PageObjects.Blockers.OrganisationClientContactAddClientToOrganisationPage;
import PageObjects.Data.JobPage;
import PageObjects.*;
import PageObjects.Sprint29.*;
import PageObjects.Sprint30.*;
import PageObjects.Sprint31.FECandidateEditActivityLogActivityPage;
import PageObjects.Sprint31.FEOrBE_PipelineMgmtOfferNotStoringCI_IDPage;
import PageObjects.Sprint34.*;
import PageObjects.Sprint35.*;
import PageObjects.Sprint36.FE_ClientContact_JobsTabErrorPage;
import PageObjects.Sprint36.FE_SearchBarFieldPlusContainerPage;
import PageObjects.Sprint37.*;
import PageObjects.Sprint38.*;
import PageObjects.Working.CreateCandidatesPage;
import PageObjects.Working.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.hotkey.Keys;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

//import sun.font.SunFontManager;


public class Steps {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    public CreateNewJobPage lp;
    public CreateCandidatesPage ccp;
    public CreateNewJobPage cjp;
    public CreateNewClientContactPage cnc;
    public CandidateRemoveLinkClientContactPage lop;
    public CandidateSummaryAddQualificationPage csp;
    public CandidatePersonalUpdateAddressPage cpp;
    public CandidateCareerAddNewRolePage nrp;
    public CreateNewCandidateListPage nlp;
    public CandidateActivityAddNewActivityPage ana;
    public CreateNewOrganisationPage cno;
    public OrganisationLocationPlusBtnMiddleAddLocationPage oal;
    public CandidateEditCandidateListPage elp;
    public ClientInformationMiddleplusBtnAddNewPositionPage cnpp;
    public CandidateAddCandidateReviewPage acrp;
    public ClientPlusButtonTopAddClientToListPage aclp;
    public ClientPlusButtonTopAddClientToListNewList aclnlp;
    public OrganisationPlusTopButtonAddAlertToRecord arp;
    public OrganisationAddToListPage oalp;
    public OrganisationAddToListNewListPage nolp;
    public ClientLinkCandidatePage clcp;
    public ClientAddAlertPage caap;
    public CandidatePlusTopButtonAddToListPage catlp;
    public CandidatePlusTopButtonAddToListNewListPage catlnlp;
    public OrganisationEditListPage oelp;
    public OrganisationLinkedJobsSubsidiaryOrganisationPage sop;
    public JobsAddAlertPage jaap;
    public CandidateRecordModalsMandatoryLocationFieldPage mlfp;
    public ClientContactRecordJobsTabPage ccrjp;
    public ClientContactRecordRemoveCandidatePage ccrrcp;
    public CandidateActivityEditActivityPage caeap;
    public FEChangeStageDropdownPage fecsdp;
    public PipelineManagementEmptyStatesforGridPage pmesgp;
    public OrganisationEditActivityPage oeap;
    public JobsEditActivityPage jeap;
    public LoginNewPage lgnp;
    public FECandidateViewActivityActivityFilterPage cvafp;
    public FEGridViewOfferPlacedPage gvop;
    public FEAddCandidateToJobTransitionToLonglistPage acjtlp;
    public FEDirectTransitionsToShortlistStagePage dttslp;
    public FEOrganisationCreateActivityActivityModalPage ocamp;
    public FEClientContactCreateActivityActivityModalPage cccamp;
    public FEJobCreateActivityActivityModalPage jcamp;
    public OrganisationClientContactAddClientToOrganisationPage olocp;
    public OrganisationPlusTopButtonAddAlertToRecord opbaatrp;
    public OrganisationRecordLocationEditLocationPage orlelp;
    public OrganisationAddListPage oalnp;
    public FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage iptos;
    public FEAndBETransitionToCVSentStageSingleOrMultiPage ttcvs;
    public FEDirectTransitionToPlacedPage dttpp;
    public FETransitionToInterviewRoundsFirstScondAndAddSingleOrMultiPage ttirfstp;
    public FEEditCVSentModalSingleOrMultiPage ecvmp;
    public FETransitionToFollowUpAdditionalRoundsPage ttfarp;
    public ALCandidatesCreateViewEditMarketingEventsFilterPage ccvemefp;
    public ALCCCreateViewEditMarketingEventsPage alccvemep;
    public ALCCCreateViewEditMarketingEventsClientEventPage alcccvemecep;
    public ALCandidatesCreateViewEditMarketingEventsCandidateEventPage alcccvemecanep;
    public FECandidateRecordPreviewPanelRefactorPage crpprp;
    public FEBEStageLogicForOutcomeStatusRejectedPage slfosr;
    public FEBEStageLogicForOutcomeStatusWrongEntryPage slfoswe;
    public FERejectCandidateFlowPage rcfp;
    public FEUnrejectCandidatesSingleOMultiPage ucsomp;
    public FEPermissionsRoleBasedOrganisationPage prbop;
    public FEPermissionsRoleBasedJobPage prbjp;
    public FECandidateEditActivityLogActivityPage cealap;
    public FE_EditInterviewRounds_SingleOrMulti_AdditionalRoundPage eirsomadp;

    public glob_LoginPage glob_loginPage;
    public glob_HudPage glob_hudPage;
    public create_NewCandidatePage create_newCandidatePage;
    public create_CandidateRecordPage create_candidateRecordPage;
    public Lunga_CreateOrganisationPage lunga_createOrganisationPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_ShortListPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SecondRoundPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_PlacedPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_OfferPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeamLongListPage beAndFE_pipeline_editModals_addResponsibleUserAndTeamLongListPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_FirstRoundPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_firstRoundPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SendCVPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage;
    public BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_AdditionalRoundsPage beAndFE_pipeline_editModals_addResponsibleUserAndTeam_additionalRoundsPage;
    public FEActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage;
    public FEAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage;
    public FEOrBE_ActivityLog_EditModal_AddResponsibleUser_Team_Other_ConsultantsPage feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage;
    public FeOrBe_LJob_CreateJobModal_AddAndViewResponsibleUser_TeamPage feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage;
    public FE_ViewDialogBoxPage fe_viewDialogBoxPage;
    public CHANGE_JobRecord_DisableEditingOrgPage change_jobRecord_disableEditingOrgPage;
    public CandidateReviewList_DisableReviewButtonPage candidateReviewList_disableReviewButtonPage;
    public FEAndBE_AlertsClientContact_StoreAndView_CreatedByPage feAndBE_alertsClientContact_storeAndView_createdByPage;
    public FEAndBE_Alerts_Job_StoreAndView_CreatedByPage feAndBE_alerts_job_storeAndView_createdByPage;
    public FEAndBE_CandidateRecord_EditResponsibleUserPage feAndBE_candidateRecord_editResponsibleUserPage;
    public FEAndBE_CandidateReview_UpdateReviewModal_AddResponsibleUserAndTeamPage feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage;
    public FEAndBE_CandidateReviewList_DisplayTeamNameInHeaderPage feAndBE_candidateReviewList_displayTeamNameInHeaderPage;
    public FEAndBE_JobRecord_AddOrEdit_OtherConsultantsPage feAndBE_jobRecord_addOrEdit_otherConsultantsPage;
    public FE_URLLinksToSharePointPermanentPage feURLLinksToSharePointContractPermanentPage;
    public FE_URLLinksToSharePointContractPage feURLLinksToSharePointContractPage;
    public FEAndBE_CandidateReviewList_DisplayRUInGridInsteadOfFlagConsultantsPage feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage;
    public CandidateNotAbleToAddARequiredQualificationOnlyPage candidateNotAbleToAddARequiredQualificationOnlyPage;
    public CreatePlacedTransitionModal_ViewOnALPage createPlacedTransitionModal_viewOnALPage;
    public Create_JobLocationRemitPage create_jobLocationRemitPage;
    public CandidatePersonalTabDeleteAndEditContactDetailsErrorPage candidatePersonalTabDeleteAndEditContactDetailsErrorPage;
    public FeOrBe_CandidateReview_Add_ResponsibleUser_And_TeamToTeviewFormPage feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage;
    public FEOrBEJobRecord_EditResponsibleUserPage feOrBEJobRecord_editResponsibleUserPage;
    public FEOrBE_Alerts_Candidate_View_CreatedByPage feOrBE_alerts_candidate_view_createdByPage;
    public FE_Pipeline_TransitionToLonglist_AddResponsibleUserAndTeamPage fe_pipeline_transitionToLonglist__addResponsibleUserAndTeamPage;
    public FEOrBE_Candidate_CreateCandidateModal_AddAndViewResponsibleUserAndTeamPage feOrBE_candidate_createCandidateModal_addAndViewResponsibleUserAndTeamPage;
    public PlacedEditActivityLog_NotUpdatingSalaryPage placedEditActivityLog_notUpdatingSalaryPage;
    public FE_DialogBox_RetainerOrShortlist_CreateJobModalPage fe_dialogBox_retainerOrShortlist_createJobModalPage;
    public CHANGE_JobLocationRemit_PopUpModalPage change_jobLocationRemit_popUpModalPage;
    public FE_CandidateListLibrary_DisplayOneNameColumnPage fe_candidateListLibrary_displayOneNameColumnPage;
    public FE_AllRecords_SearchForARecordByUniqueIDPage fe_allRecords_searchForARecordByUniqueIDPage;
    public FE_Organisation_SearchForAnOrganisationRecordByNamePage fe_organisation_searchForAnOrganisationRecordByNamePage;
    public FE_Candidate_SearchForACandidateByEmailAddressPage fe_candidate_searchForACandidateByEmailAddressPage;
    public FE_Job_SearchForAJobByOrganisationNamePage fe_job_searchForAJobByOrganisationNamePage;
    public FE_Lists_AddAndViewRecordsOnATeamListPage fe_lists_addAndViewRecordsOnATeamListPage;
    public FE_Integration_SearchForJobUsingIDAndViewRealDataInSearchBarPage fe_integration_searchForJobUsingIDAndViewRealDataInSearchBarPage;
    public FE_TeamLists_AddResponsibleTeamToQuickCreateNewListFormPage fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage;
    public FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_ClientContactPage feTeamListsAddResponsibleTeamToQuickCreateNewListFormClientContactPage;
    public FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_OrganisationPage fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage;
    public FE_AddToJob_DisplayOnlyJobsAssociatedWithLoggedInUserPage fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage;
    public FE_CandidateReviewListDisplaying_Undefined_InHeaderForZeroCandidatesInListPage fe_candidateReviewListDisplaying_undefined_inHeaderForZeroCandidatesInListPage;
    public FE_PlacedTransitionModal_EditModal_CC_RU_RT_FieldPage fe_placedTransitionModal_editModal_cc_ru_rt_fieldPage;
    public BE_Alerts_Candidate_AddAndViewOnRecordPage be_alerts_candidate_addAndViewOnRecordPage;
    public FEAndBE_Alerts_Candidate_ViewCandidateAlertsInListsOrlibraryPage feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage;
    public Alerts_Candidate_ArchiveAlertPage alerts_candidate_archiveAlertPage;
    public Alerts_Candidate_EditExistingAlertPage alerts_candidate_editExistingAlertPage;
    public DialogBox_RetainerOrShortlist_JobInformationTabPage dialogBox_retainerOrShortlist_jobInformationTabPage;
    public Candidate_ErrorWhenCreatingAnAlertAfterClearingAnExpiryDatePage candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage;
    public ClientContact_NoValidationOnPositionStartAndEndDatesPage clientContact_noValidationOnPositionStartAndEndDatesPage;
    public Candidate_DeleteAlertDialogueBox_Ok_ButtonIssuePage candidate_deleteAlertDialogueBox_ok_buttonIssuePage;
    public ClientContact_DeleteAlertDialogueBox_Ok_ButtonIssuePage clientContact_deleteAlertDialogueBox_ok_buttonIssuePage;
    public Job_DeleteAlertDialogueBox_Ok_ButtonIssuePage job_deleteAlertDialogueBox_ok_buttonIssuePage;
    public Organisation_DeleteAlertDialogueBox_Ok_ButtonIssuePage organisation_deleteAlertDialogueBox_ok_buttonIssuePage;
    public FEAndBE_Candidate_Status_not_updating_or_setting_to_correct_default_valuePage feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage;
    public FE_SearchBarFieldPlusContainerPage fe_searchBarFieldPlusContainerPage;
    public FEOrBE_PipelineMgmtOfferNotStoringCI_IDPage feOrBE_pipelineMgmtOfferNotStoringCI_idPage;
    public FE_ClientContact_JobsTabErrorPage fe_clientContact_jobsTabErrorPage;
    public FE_JobRecord_StatusDropdownPage fe_jobRecord_statusDropdownPage;
    public FE_SearchResultsPage_ViewAllClientContactResultsInListVewPage fe_searchResultsPage_viewAllClientContactResultsInListVewPage;
    public FE_ImplementStandardAndValidationOnPhoneNumberInputPage fe_implementStandardAndValidationOnPhoneNumberInputPage;
    public FE_CandidateOrCC_GenderDropdownValuesPage fe_candidateOrCC_genderDropdownValuesPage;
    public FE_MyJobsList_StatusDropdownPage fe_myJobsList_statusDropdownPage;






    //######################################Data########################################
    public JobPage jp;
//    private SunFontManager.FamilyDescription CandidateDetails;


    @Before
    public void doSomethingBefore(Scenario scenario) {
        if(System.getProperty("env") == null){
            System.setProperty("env", "dev");
        }
        System.out.println("Environment set to: " + System.getProperty("env"));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver_v95.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 30);
        actions = new Actions(driver);
        create_newCandidatePage = new create_NewCandidatePage(driver, wait);
        create_candidateRecordPage = new create_CandidateRecordPage(driver, wait);
        glob_hudPage = new glob_HudPage(driver, wait);
        glob_loginPage = new glob_LoginPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_ShortListPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SecondRoundPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_PlacedPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_OfferPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeamLongListPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeamLongListPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_firstRoundPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_FirstRoundPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_SendCVPage(driver, wait);
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_additionalRoundsPage = new BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_AdditionalRoundsPage(driver, wait);
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage = new FEActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage(driver, wait);
        feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage = new FEAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage(driver, wait);
        feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage = new FEOrBE_ActivityLog_EditModal_AddResponsibleUser_Team_Other_ConsultantsPage(driver, wait);
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage = new FeOrBe_LJob_CreateJobModal_AddAndViewResponsibleUser_TeamPage(driver, wait);
        fe_viewDialogBoxPage = new FE_ViewDialogBoxPage(driver, wait);
        change_jobRecord_disableEditingOrgPage = new CHANGE_JobRecord_DisableEditingOrgPage(driver, wait);
        candidateReviewList_disableReviewButtonPage = new CandidateReviewList_DisableReviewButtonPage(driver, wait);
        feAndBE_alertsClientContact_storeAndView_createdByPage = new FEAndBE_AlertsClientContact_StoreAndView_CreatedByPage(driver, wait);
        feAndBE_alerts_job_storeAndView_createdByPage = new FEAndBE_Alerts_Job_StoreAndView_CreatedByPage(driver, wait);
        feAndBE_candidateRecord_editResponsibleUserPage = new FEAndBE_CandidateRecord_EditResponsibleUserPage(driver, wait);
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage = new FEAndBE_CandidateReview_UpdateReviewModal_AddResponsibleUserAndTeamPage(driver, wait);
        feAndBE_candidateReviewList_displayTeamNameInHeaderPage = new FEAndBE_CandidateReviewList_DisplayTeamNameInHeaderPage(driver, wait);
        feAndBE_jobRecord_addOrEdit_otherConsultantsPage = new FEAndBE_JobRecord_AddOrEdit_OtherConsultantsPage(driver, wait);
        feURLLinksToSharePointContractPermanentPage = new FE_URLLinksToSharePointPermanentPage(driver, wait);
        feURLLinksToSharePointContractPage = new FE_URLLinksToSharePointContractPage(driver, wait);
        feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage = new FEAndBE_CandidateReviewList_DisplayRUInGridInsteadOfFlagConsultantsPage(driver, wait);
        candidateNotAbleToAddARequiredQualificationOnlyPage = new CandidateNotAbleToAddARequiredQualificationOnlyPage(driver, wait);
        createPlacedTransitionModal_viewOnALPage = new CreatePlacedTransitionModal_ViewOnALPage(driver, wait);
        create_jobLocationRemitPage = new Create_JobLocationRemitPage(driver, wait);
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage = new CandidatePersonalTabDeleteAndEditContactDetailsErrorPage(driver, wait);
        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage = new FeOrBe_CandidateReview_Add_ResponsibleUser_And_TeamToTeviewFormPage(driver, wait);
        feOrBEJobRecord_editResponsibleUserPage = new FEOrBEJobRecord_EditResponsibleUserPage(driver, wait);
        feOrBE_alerts_candidate_view_createdByPage = new FEOrBE_Alerts_Candidate_View_CreatedByPage(driver, wait);
        fe_pipeline_transitionToLonglist__addResponsibleUserAndTeamPage = new FE_Pipeline_TransitionToLonglist_AddResponsibleUserAndTeamPage(driver, wait);
        feOrBE_candidate_createCandidateModal_addAndViewResponsibleUserAndTeamPage = new FEOrBE_Candidate_CreateCandidateModal_AddAndViewResponsibleUserAndTeamPage(driver, wait);
        placedEditActivityLog_notUpdatingSalaryPage = new PlacedEditActivityLog_NotUpdatingSalaryPage(driver, wait);
        fe_dialogBox_retainerOrShortlist_createJobModalPage = new FE_DialogBox_RetainerOrShortlist_CreateJobModalPage(driver, wait);
        change_jobLocationRemit_popUpModalPage = new CHANGE_JobLocationRemit_PopUpModalPage(driver, wait);
        fe_candidateListLibrary_displayOneNameColumnPage = new FE_CandidateListLibrary_DisplayOneNameColumnPage(driver, wait);
        fe_allRecords_searchForARecordByUniqueIDPage = new FE_AllRecords_SearchForARecordByUniqueIDPage(driver, wait);
        fe_organisation_searchForAnOrganisationRecordByNamePage = new FE_Organisation_SearchForAnOrganisationRecordByNamePage(driver, wait);
        fe_candidate_searchForACandidateByEmailAddressPage = new FE_Candidate_SearchForACandidateByEmailAddressPage(driver, wait);
        fe_job_searchForAJobByOrganisationNamePage = new FE_Job_SearchForAJobByOrganisationNamePage(driver, wait);
        fe_lists_addAndViewRecordsOnATeamListPage = new FE_Lists_AddAndViewRecordsOnATeamListPage(driver, wait);
        fe_integration_searchForJobUsingIDAndViewRealDataInSearchBarPage = new FE_Integration_SearchForJobUsingIDAndViewRealDataInSearchBarPage(driver, wait);
        fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage = new FE_TeamLists_AddResponsibleTeamToQuickCreateNewListFormPage(driver, wait);
        feTeamListsAddResponsibleTeamToQuickCreateNewListFormClientContactPage = new FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_ClientContactPage(driver, wait);
        fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage = new FE_TeamLists_AddResponsibleTeamToQuickCreateNewListForm_OrganisationPage(driver, wait);
        fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage =new FE_AddToJob_DisplayOnlyJobsAssociatedWithLoggedInUserPage(driver, wait);
        fe_candidateReviewListDisplaying_undefined_inHeaderForZeroCandidatesInListPage = new FE_CandidateReviewListDisplaying_Undefined_InHeaderForZeroCandidatesInListPage(driver, wait);
        fe_placedTransitionModal_editModal_cc_ru_rt_fieldPage = new FE_PlacedTransitionModal_EditModal_CC_RU_RT_FieldPage(driver, wait);
        be_alerts_candidate_addAndViewOnRecordPage = new BE_Alerts_Candidate_AddAndViewOnRecordPage(driver, wait);
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage = new FEAndBE_Alerts_Candidate_ViewCandidateAlertsInListsOrlibraryPage(driver, wait);
        alerts_candidate_archiveAlertPage = new Alerts_Candidate_ArchiveAlertPage(driver, wait);
        alerts_candidate_editExistingAlertPage = new Alerts_Candidate_EditExistingAlertPage(driver, wait);
        dialogBox_retainerOrShortlist_jobInformationTabPage = new DialogBox_RetainerOrShortlist_JobInformationTabPage(driver, wait);
        candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage = new Candidate_ErrorWhenCreatingAnAlertAfterClearingAnExpiryDatePage(driver, wait);
        clientContact_noValidationOnPositionStartAndEndDatesPage = new ClientContact_NoValidationOnPositionStartAndEndDatesPage(driver, wait);
        candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage = new Candidate_ErrorWhenCreatingAnAlertAfterClearingAnExpiryDatePage(driver, wait);
        candidate_deleteAlertDialogueBox_ok_buttonIssuePage = new Candidate_DeleteAlertDialogueBox_Ok_ButtonIssuePage(driver, wait);
        clientContact_deleteAlertDialogueBox_ok_buttonIssuePage = new ClientContact_DeleteAlertDialogueBox_Ok_ButtonIssuePage(driver, wait);
        job_deleteAlertDialogueBox_ok_buttonIssuePage = new Job_DeleteAlertDialogueBox_Ok_ButtonIssuePage(driver, wait);
        organisation_deleteAlertDialogueBox_ok_buttonIssuePage = new Organisation_DeleteAlertDialogueBox_Ok_ButtonIssuePage(driver, wait);
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage = new FEAndBE_Candidate_Status_not_updating_or_setting_to_correct_default_valuePage(driver, wait);
        fe_searchBarFieldPlusContainerPage = new FE_SearchBarFieldPlusContainerPage(driver, wait);
        feOrBE_pipelineMgmtOfferNotStoringCI_idPage = new FEOrBE_PipelineMgmtOfferNotStoringCI_IDPage(driver, wait);
        fe_clientContact_jobsTabErrorPage = new FE_ClientContact_JobsTabErrorPage(driver, wait);
        fe_jobRecord_statusDropdownPage = new FE_JobRecord_StatusDropdownPage(driver, wait);
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage = new FE_SearchResultsPage_ViewAllClientContactResultsInListVewPage(driver, wait);
        fe_implementStandardAndValidationOnPhoneNumberInputPage = new FE_ImplementStandardAndValidationOnPhoneNumberInputPage(driver, wait);
        fe_candidateOrCC_genderDropdownValuesPage = new FE_CandidateOrCC_GenderDropdownValuesPage(driver, wait);
        fe_myJobsList_statusDropdownPage = new FE_MyJobsList_StatusDropdownPage(driver, wait);




    }

//    @After
//    public void doSomethingAfter(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot...
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            // embed it in the report.
//            scenario.attach(screenshot, "image/png",scenario.getName());
//        }
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver_v95.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new CreateNewJobPage(driver);
        ccp = new CreateCandidatesPage(driver);
        cjp = new CreateNewJobPage(driver);
        cnc = new CreateNewClientContactPage(driver);
        lop = new CandidateRemoveLinkClientContactPage(driver);
        csp = new CandidateSummaryAddQualificationPage(driver);
        cpp = new CandidatePersonalUpdateAddressPage(driver);
        nrp = new CandidateCareerAddNewRolePage(driver);
        nlp = new CreateNewCandidateListPage(driver);
        ana = new CandidateActivityAddNewActivityPage(driver);
        cno = new CreateNewOrganisationPage(driver);
        oal = new OrganisationLocationPlusBtnMiddleAddLocationPage(driver);
        elp = new CandidateEditCandidateListPage(driver);
        cnpp = new ClientInformationMiddleplusBtnAddNewPositionPage(driver);
        acrp = new CandidateAddCandidateReviewPage(driver);
        aclp = new ClientPlusButtonTopAddClientToListPage(driver);
        aclnlp = new ClientPlusButtonTopAddClientToListNewList(driver);
        arp = new OrganisationPlusTopButtonAddAlertToRecord(driver);
        oalp = new OrganisationAddToListPage(driver);
        nolp = new OrganisationAddToListNewListPage(driver);
        clcp = new ClientLinkCandidatePage(driver);
        caap = new ClientAddAlertPage(driver);
        catlp = new CandidatePlusTopButtonAddToListPage(driver);
        catlnlp = new CandidatePlusTopButtonAddToListNewListPage(driver);
        oelp = new OrganisationEditListPage(driver);
        sop = new OrganisationLinkedJobsSubsidiaryOrganisationPage(driver);
        jaap = new JobsAddAlertPage(driver);
        mlfp = new CandidateRecordModalsMandatoryLocationFieldPage(driver);
        ccrjp = new ClientContactRecordJobsTabPage(driver);
        ccrrcp = new ClientContactRecordRemoveCandidatePage(driver);
        caeap = new CandidateActivityEditActivityPage(driver);
        //crccp = new CandidateRemoveClientContactPage(driver);
        fecsdp = new FEChangeStageDropdownPage(driver);
        pmesgp = new PipelineManagementEmptyStatesforGridPage(driver);
        oeap = new OrganisationEditActivityPage(driver);
        jeap = new JobsEditActivityPage(driver);
        lgnp = new LoginNewPage(driver);
        cvafp = new FECandidateViewActivityActivityFilterPage(driver);
        gvop = new FEGridViewOfferPlacedPage(driver);
        acjtlp = new FEAddCandidateToJobTransitionToLonglistPage(driver);
        dttslp = new FEDirectTransitionsToShortlistStagePage(driver);
        ocamp = new FEOrganisationCreateActivityActivityModalPage(driver);
        cccamp = new FEClientContactCreateActivityActivityModalPage(driver);
        jcamp = new FEJobCreateActivityActivityModalPage(driver);
        olocp = new OrganisationClientContactAddClientToOrganisationPage(driver);
        opbaatrp = new OrganisationPlusTopButtonAddAlertToRecord(driver);
        orlelp = new OrganisationRecordLocationEditLocationPage(driver);
        oalnp = new OrganisationAddListPage(driver);
        iptos = new FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage(driver);
        ttcvs = new FEAndBETransitionToCVSentStageSingleOrMultiPage(driver);
        dttpp = new FEDirectTransitionToPlacedPage(driver);
        ttirfstp = new FETransitionToInterviewRoundsFirstScondAndAddSingleOrMultiPage(driver);
        ecvmp = new FEEditCVSentModalSingleOrMultiPage(driver);
        ttfarp = new FETransitionToFollowUpAdditionalRoundsPage(driver);
        ccvemefp = new ALCandidatesCreateViewEditMarketingEventsFilterPage(driver);
        alccvemep = new ALCCCreateViewEditMarketingEventsPage(driver);
        alcccvemecep = new ALCCCreateViewEditMarketingEventsClientEventPage(driver);
        alcccvemecanep = new ALCandidatesCreateViewEditMarketingEventsCandidateEventPage(driver);
        crpprp = new FECandidateRecordPreviewPanelRefactorPage(driver);
        slfosr = new FEBEStageLogicForOutcomeStatusRejectedPage(driver);
        slfoswe = new FEBEStageLogicForOutcomeStatusWrongEntryPage(driver);
        rcfp = new FERejectCandidateFlowPage(driver);
        ucsomp = new FEUnrejectCandidatesSingleOMultiPage(driver);
        prbop = new FEPermissionsRoleBasedOrganisationPage(driver);
        prbjp = new FEPermissionsRoleBasedJobPage(driver);
        eirsomadp = new FE_EditInterviewRounds_SingleOrMulti_AdditionalRoundPage(driver);
        cealap = new FECandidateEditActivityLogActivityPage(driver);

        //########################################DATA#############################################
        jp = new JobPage(driver);
    }


    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("User enters Username as {string}")
    public void user_enters_username_as(String username) {
        lp.setTxtUsername(username);
    }

    @Then("User enters Password as {string}")
    public void user_enters_password_as(String password) {
        lp.setTxtPassword(password);
    }

    @Then("Clicks on SignIn button")
    public void click_on_sign_in_button() {
        lp.clickBtnSignIn();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @When("User Clicks on Universal Plus Button")
    public void user_clicks_on_universal_plus_button() {
        lp.clickBtnUniversalPlusSign();
    }


    //########################################CREATE CANDIDATE####################################################

    @When("Clicks on Create Candidate Button")
    public void clicks_on_create_candidate_button() {
        ccp.clickBtnCreateCandidate();
    }

    @Then("User enters First Name as {string}")
    public void user_enters_first_name_as(String fName) {
        ccp.setTxtFirstName(fName);
    }

    @Then("User enters Family Name as {string}")
    public void user_enters_family_name_as(String lName) {
        ccp.setTxtFamilyName(lName);
    }

    @Then("User enters City as {string}")
    public void user_enters_cit_as(String cName) {
        ccp.setTxtCityOrTownOrSuburbs(cName);
    }


    @Then("User clicks on Add Contacts button")
    public void user_clicks_on_add_contacts_button() {
        ccp.clickBtnAddContacts();
    }

    @Then("User Adds Mobile Contacts as {string}")
    public void user_adds_mobile_contacts_as(String contactNumber) {
        ccp.setTxtAddMobile(contactNumber);
    }


    @Then("Enters Job Title as {string}")
    public void enters_job_title_as(String title) {
        ccp.setTxtJobTitle(title);
    }

    @Then("User enter Organisation as {string}")
    public void user_enter_organisation_as(String organisation) throws Exception{
        ccp.setTxtOrganisation_menu(organisation);
    }

    @Then("User selects Position Type")
    public void user_selects_position_type() {
        ccp.clickLnkPositionTypeMenu();
    }

    @Then("User selects Position Type Item")
    public void user_selects_position_type_item() {
        ccp.clickLnkPositionTypeMenuItem();
    }

    @Then("User enters Desired Work Location as {string}")
    public void user_enters_desired_work_location_as(String location) {
        ccp.setTxtDesiredWorkLocation(location);
    }


    @Then("User clicks on Create")
    public void user_clicks_on_create() {
        ccp.clickBtnCreate();
    }

    @Then("User clicks on View button")
    public void user_clicks_on_view_button() throws Exception {
        ccp.clickViewButton();
    }

    //##############################################CREATE JOB STEPS##############################################


    @When("Clicks on Create Job Button")
    public void click_on_create_new_job_button() {
        cjp.clickBtnCreateJob();
    }

    @When("User enters Job Title as {string}")
    public void user_enters_job_title_as(String title) {
        cjp.setTxtJobTitle(title);
    }


    @Then("User searches for Organisation Menu as {string}")
    public void user_searches_for_organisation_menu_as(String oName) {
        cjp.setTxtOrganisation_menu(oName);
    }

    @Then("User selects an Organisation Menu Item")
    public void user_selects_an_organisation_menu_item() {
        //cjp.clickOrganisation_menuitem();
        cjp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User searches for Location Menu as {string}")
    public void user_searches_for_location_menu_as(String location) throws Exception {
        cjp.setTxtLocation_menu(location);
    }

    @When("User selects Location Menu Item")
    public void user_selects_location_menu_item() {
        cjp.clickLocation_menuitem_firstOption();
    }

    @When("User searches for Main Client Contact Menu as {string}")
    public void user_searches_for_main_client_contact_menu_as(String clientContact) throws Exception {
        cjp.setTxtMainClientContact_menu(clientContact);
    }

    @Then("User selects Main Client Contact Menu Item")
    public void user_selects_main_client_contact_menu_item() {
        cjp.clickMainClientContact_menuitem_firstOption();
    }


    @Then("User clicks on selected Job Status Item")
    public void user_clicks_on_selected_job_status_item() {
        cjp.clickLnkJobStatus_menuitem();
    }

    @When("User clicks on Agreement Type menu")
    public void user_clicks_on_agreement_type_menu() throws Exception {
        cjp.clickLnkAgreementType_menu();
    }

    @Then("User clicks on selected Agreement Type Item")
    public void user_clicks_on_selected_agreement_type_item() {
        cjp.clickLnkAgreementType_menuitem_firstOption();
    }

    @When("User clicks on Exclusivity Type menu")
    public void user_clicks_on_exclusivity_type_menu() throws Exception{
        cjp.clickLnkExclusivityType_menu();
    }

    @Then("User clicks on selected Exclusivity Type Item")
    public void user_clicks_on_selected_exclusivity_type_item() throws Exception{
        cjp.clickLnkExclusivityType_menuitem_firstOption();
    }

    @When("User clicks on Source Item")
    public void user_clicks_on_source_item() throws Exception{
        cjp.clickLnkSourceType_menu();
    }

    @Then("User clicks on selected Source Type Item")
    public void user_clicks_on_selected_source_type_item() {
        cjp.clickLnkSourceType_menuitem_firstOption();
    }


    @Then("User clicks on Job Type Item")
    public void user_clicks_on_job_type_item() throws Exception{
        cjp.clickLnkJobType_menu();
    }

    @Then("User clicks on selected Job Type Item")
    public void user_clicks_on_selected_job_type_item() {
        cjp.clickLnkJobType_menuitem_firstOption();
    }





    @Then("Click on Client Email button")
    public void click_on_client_email_button() {
        cjp.clickBtnEmailPortalButton();
    }

    @Then("User enters Link as {string}")
    public void user_enters_link_as(String lName) {
        cjp.setTxtLink(lName);
    }

    @Then("Click Check Box")
    public void click_check_box() {
        cjp.clickCbxSelectIfJobPostingIsRequired();
    }

    @Then("User enters Background info as {string}")
    public void user_enters_background_info_as(String information) {
        cjp.setTxtBackgroundInfo(information);
    }

    @Then("Click on Create button")
    public void click_on_create_button() {
        cjp.clickBtnCreate();
    }
//
//    @Then("Click on Cancel button")
//    public void click_on_cancel_button() {
//        cjp.clickBtnCancel();
//    }


    //###############################################CREATE NEW CLIENT CONTACT#########################################

    @Then("Clicks on Client Contact Button")
    public void clicks_on_client_contact_button() {
        cnc.clickBtnClientContact();
    }

    @Then("User enters First Name of New Client as {string}")
    public void user_enters_first_name_of_new_client_as(String fName) {
        cnc.setTxtFirstName(fName);
    }

    @Then("User enters family Name of New Client as {string}")
    public void user_enters_family_name_of_new_client_as(String familyName) {
        cnc.setTxtFamilyName(familyName);
    }

    @When("User Enters Job Title of New Client as {string}")
    public void user_enters_job_title_of_new_client_as(String jobTitle) {
        cnc.setTxtJobTitle(jobTitle);
    }


    @When("User enters an Organisation Menu Item of New client as {string}")
    public void user_enters_an_organisation_menu_item_of_new_client_as(String orgName) {
        cnc.setTxtOrganisation_menu(orgName);
    }

    @Then("User selects an Organisation Menu Items")
    public void user_selects_an_organisation_menu_items() {
        //cjp.clickOrganisation_menuitem();
        cnc.clickOrganisation_menuitem_firstOption();
    }

    @Then("User Searches for Locations Menu as {string}")
    public void user_searches_for_locations_menu_as(String location) throws Exception {
        cnc.setTxtLocation_menu(location);
    }

    @When("User Selects Locations Menu Item")
    public void user_selects_locations_menu_item() {
        cnc.clickLocation_menuitem_firstOption();
    }


    //##################################ClickOpen##################################################


    //##################################ClickOpen##################################################


    @Then("User clicks on Organisation Name")
    public void user_clicks_on_organisation_name() {
        cnc.clickOrganisation_menuitem();
    }


    @Then("Clicks on Current Position Contact Details Plus button")
    public void clicks_on_current_position_contact_details_plus_button() {
        cnc.clickBtnCurrentPositionContactDetails();
    }

    @Then("Clicks on Mobile Phone")
    public void clicks_on_mobile_phone() {
        cnc.clickBtnMobilePhone();
    }

    @Then("Enters Mobile Phone as {string}")
    public void enters_mobile_phone_as(String mobilePhone) {
        cnc.setTxtMobilePhone(mobilePhone);
    }


    @Then("Click on Create button for new Client")
    public void click_on_create_button_for_new_client() {
        cnc.clickCreate();
    }


    //###############################################Link Client Contact###################################

    @When("User clicks on Ellipses")
    public void user_clicks_on_ellipses() {
        lp.clickBtnEllipses();
    }

    @Then("Clicks on Link Client Contact")
    public void clicks_on_link_client_contact() {
        lp.clickBtnLinkClientContact();
    }

    @When("User enters Organisation as \\{string}")
    public void user_enters_organisation_as() {

    }

    @When("User enters Client Contact as \\{string}")
    public void user_enters_client_contact_as() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Clicks on Select button")
    public void clicks_on_select_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //###########################################LINK ORGANISATION TO A CLIENT###############################

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        lop.clickBtnSearch();
    }

    @Then("Searches for Candidate name as {string}")
    public void searches_for_candidate_name_as(String cName) {
        lop.setTxtSearch(cName);

    }

    @Then("User clicks on Candidate {string}")
    public void user_clicks_on_on_candidate(String text) {
        lop.clickLnkCandidate_Option(text);
    }

    @Then("User click on the Top Three Dots")
    public void user_click_on_top_three_dots() {
        lop.clickBtnThreeDots();
    }

    @Then("User clicks on Link Client Contact")
    public void user_clicks_on_link_client_contact() {
        lop.clickBtnLinkClientContact();
    }

    @When("User enters Client Contact as {string}")
    public void user_enters_client_contact_as(String clientContact) {
        lop.setTxtClientContact(clientContact);
    }

    @Then("User clicks on Create to submit Client Contact")
    public void user_clicks_on_create_to_submit_client_contact() {
        lop.clickBtnCreateClientContact();
    }



    //#######################################Candidate - Summary - Add Qualification#############################

    @When("User clicks on the middle plus button")
    public void user_clicks_on_the_middle_plus_button() throws Exception{
        csp.clickBtnMiddlePlus();
    }

    @Then("User enters Qualification Name {string}")
    public void user_enters_qualification_name(String qualification) {
        csp.setTxtQualification(qualification);
    }

    @Then("User enters name of Institution {string}")
    public void user_enters_name_of_institution(String institution) {
        csp.setTxtInstitution(institution);
    }

    @When("User selects Date Issued")
    public void user_selects_date_issued() {
        csp.clickBtnDateIssued();
    }

    @Then("User enters achieved Grade {string}")
    public void user_enters_achieved_grade(String grade) {
        csp.setTxtGrade(grade);
    }

    @Then("User clicks on Create button")
    public void user_clicks_on_create_button() {
        csp.clickBtnCreate();
    }

    //################################################Candidate-Personal-Update Address############################

    @When("User clicks on Personal link")
    public void user_clicks_on_personal_link() {
        cpp.clickLnkPersonal();
    }

//    @Then("User clicks on Change button")
//    public void user_clicks_on_change_button_as() throws Exception{
//        cpp.clickBtnChangeAddress();
//    }

    @Then("User clicks on Change button as {string}")
    public void user_clicks_on_change_button_as(String text) {
        cpp.click(text);
    }

    @Then("Selects Country")
    public void selects_country() {
        cpp.clickBtnCountry_menuitem();
    }

    @When("User enters Address Line {int} {string}")
    public void user_enters_address_line(Integer int1, String addressLine1) {
        cpp.setTxtAddressLine1(addressLine1);
    }

    @Then("User enters City name as {string}")
    public void user_enters_city_name_as(String city) {
        cpp.setTxtCity(city);
    }

    @Then("User enters Province name as {string}")
    public void user_enters_province_name_as(String province) {
        cpp.setTxtProvince(province);
    }

    @When("User enters Post Code as {string}")
    public void user_enters_post_code_as(String postCode) {
        cpp.setTxtPostCode(postCode);
    }

    @Then("User clicks on Save button")
    public void user_clicks_on_save_button() {
        cpp.clickBtnSave();
    }

    //###########################################Candidate - Career - Add New Role#########################

    @When("User clicks on the Candidate {string}")
    public void user_clicks_on_the_candidate(String string) {
        nrp.clickLnkCandidateItem();
    }


    @When("User clicks on Career")
    public void user_clicks_on_career() {
        nrp.clickLnkCareer();
    }

    @Then("User clicks on the current roles plus button")
    public void user_clicks_on_the_current_roles_plus_button() {
        nrp.clickBtnCurrentRolesPlus();
    }

    @Then("User enters Job Tile as {string}")
    public void user_enters_job_tile_as(String jobTitle) {
        nrp.setTxtJobTile(jobTitle);
    }

    @When("User enters Position Type")
    public void user_enters_position_type() {
        nrp.clickBtnPositionType();
    }

    @Then("User enters Salary rate {string}")
    public void user_enters_salary_rate(String rate) {
        nrp.setTxtRate(rate);
    }

    @Then("User selects Pay Period")
    public void user_selects_pay_period() {
        nrp.clickBtnPayPeriod();
    }

    @When("User clicks Add button")
    public void user_clicks_add_button() {
        nrp.clickBtnAdd();
    }


    //#################################################Candidate-Activity - Add New Activity#############################

    @Then("User click on Search button")
    public void user_click_on_search_button() {
        ana.clickBtnSearch();
    }

    @Then("User text on Search bar as {string}")
    public void user_text_on_search_bar_as(String text) throws Exception{
        ana.getTxtSearch(text);
    }

    @Then("User clicks on Candidate item")
    public void user_clicks_on_candidate_item() {
        ana.clickCandidateItem();
    }

    @Then("User clicks on Candidate menu item")
    public void user_clicks_on_candidate_menu_item() {

    }

    @When("User clicks on Activity")
    public void user_clicks_on_activity() {
        ana.clickLnkActivity();
    }

    @Then("User clicks on the activity plus button")
    public void user_clicks_on_the_activity_plus_button() {
        ana.clickBtnActivityRolesPlus();
    }

    @When("User enters Activity Type")
    public void user_enters_activity_type() throws Exception{
        ana.clickBtnActivityType_menu();
    }

    @Then("User clicks on the Create button")
    public void user_clicks_on_the_create_button() throws Exception{
        ana.clickBtnCreate();
    }

    //##########################################Create New Organisation##################################################

    @When("User clicks on Organisation")
    public void user_clicks_on_organisation() {
        cno.clickBtnOrganisation();
    }

    @Then("User enters an Organisation Name as {string}")
    public void user_enters_an_organisation_name_as(String organisationName) {
        cno.setTxtOrganisation(organisationName);
    }

    @When("User enters Location Name as {string}")
    public void user_enters_location_name_as(String locationName) {
        cno.setTxtLocation(locationName);
    }

    @When("User selects Country")
    public void user_selects_country() {
        cno.clickCountry_menuitem();
    }

    @When("User enter City as {string}")
    public void user_enter_city_as(String cityName) {
        cno.setTxtCity(cityName);
    }


    @Then("User clicks the Create button")
    public void user_clicks_the_create_button() {
        cno.clickBtnCreate();
    }

    //#############################Organisations - Location - Plus Middle Button - Add Location ####################


    //    @When("User clicks on the Menu button")
//    public void user_clicks_on_the_menu_button() {
//        oal.clickBtnMenuOpen();
//    }
    @When("User clicks on the Menu button as {string}")
    public void user_clicks_on_the_menu_button_as(String menu) {
        oal.click(menu);
    }

    @Then("User clicks on the Organisation link")
    public void user_clicks_on_the_organisation_link() throws Exception{
        oal.clickBtnOrganisationLink();
    }

    @When("User clicks on the Organisation link item as {string}")
    public void user_clicks_on_the_organisation_link_item_as(String organisationItem) {
        oal.clickOrganisation_menu(organisationItem);
    }

    @When("User clicks on the Organisation link menu item as {string}")
    public void user_clicks_on_the_organisation_link_menu_item_as(String organisationMeniItem) {
        oal.clickOrganisation_menuitem(organisationMeniItem);
    }

    @When("User clicks on the Location link")
    public void user_clicks_on_the_location_link() {
        oal.setLnkLocation();
    }

    @When("User clicks on the Location Plus button")
    public void user_clicks_on_the_location_plus_button() {
        oal.clickBtnLocationPlus();
    }

    @Then("User enters the Location Name as {string}")
    public void user_enters_the_location_name_as(String locationName) throws Exception{
        oal.setTxtLocationName(locationName);
    }

    @When("User selects their Country")
    public void user_selects_their_country() throws Exception{
        oal.clickCountry_menuitem();
    }

    @Then("Clicks on Make this primary location")
    public void clicks_on_make_this_primary_location() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters their City as {string}")
    public void user_enters_their_city_as(String city) {
        oal.setTxtCity(city);
    }

    @When("User clicks Create button")
    public void user_clicks_create_button() {
        oal.clickBtnCreate();
    }

    //##########################################Create New Candidate List###########################################

    @Then("User clicks on the universal Plus button")
    public void user_clicks_on_the_universal_plus_button() {
        nlp.clickBtnUniversalPlusSign();
    }

    @Then("User clicks on List")
    public void user_clicks_on_list() {
        nlp.clickBtnList();
    }

    @When("User clicks on Candidate")
    public void user_clicks_on_candidate() {
        nlp.clickBtnCandidate();
    }

    @Then("User enters List Name as {string}")
    public void user_enters_list_name_as(String listName) {
        nlp.setTxtListName(listName);
    }

    @Then("User click on the Create button")
    public void user_click_on_the_create_button() {
        nlp.clickBtnCreate();
    }

    //################################################Edit Candidate List###############################################


    @Then("User clicks on the Candidate List link")
    public void user_clicks_on_the_candidate_list_link() throws Exception{
        elp.clickBtnCandidateList();
    }

    @When("User clicks on a Personal List link as {string}")
    public void user_clicks_on_a_personal_list_link_as(String personal) {
        elp.clickBtnPersonalList(personal);
    }

    @When("User clicks the Edit button")
    public void user_clicks_the_edit_button() throws Exception{
        elp.clickBtnEdit();
    }

    @Then("User enters the List new  Name as {string}")
    public void user_enters_the_listnew_name_as(String listName) throws Exception{
        elp.setTxtListName(listName);
    }

    @When("User clicks the Update button")
    public void user_clicks_the_update_button() {
        elp.clickBtnUpdate();

    }


    //#########################################Clint - Middle Plus Button - Add New Position################################

    @Then("User clicks on the Client link")
    public void user_clicks_on_the_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User clicks on the Client link item as {string}")
    public void user_clicks_on_the_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @When("User clicks on Information link")
    public void user_clicks_on_information_link() {
        cnpp.setLnkInformation();
    }

    @When("User clicks on Position History Plus button")
    public void user_clicks_on_position_history_plus_button() {
        cnpp.clickBtnPositionHistoryPlus();
    }

    @Then("User enter Job Title as {string}")
    public void user_enter_job_title_as(String jobTitle) {
        cnpp.setTxtJobTitle(jobTitle);
    }

    @When("User search for Organisation Menu as {string}")
    public void user_search_for_organisation_menu_as(String organisation) {
        cnpp.setTxtOrganisation_menu(organisation);
    }

    @When("User select an Organisation Menu Items")
    public void user_select_an_organisation_menu_items() {
        cnpp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User search for Location Menu as {string}")
    public void user_search_for_location_menu_as(String location) throws Exception{
        cnpp.setTxtLocation_menu(location);
    }

    @When("User select Location Menu Item")
    public void user_select_location_menu_item() {
        cnpp.clickLocation_menuitem_firstOption();
    }


    @Then("User selects Duration")
    public void user_selects_duration() {
        cnpp.setTxtDuration();
    }

    @Then("User clicks on OK")
    public void user_clicks_on_ok() {
        cnpp.clickBtnOK();
    }

    @When("User clicks on Current at this role")
    public void user_clicks_on_current_at_this_role() {
        cnpp.clickBtnCurrentlyAtThiRole();
    }

    @When("Clicks on Current Position Contact Details Plus")
    public void clicks_on_current_position_contact_details_plus() throws Exception{
        cnpp.clickBtnCurrentPositionContactDetails();
    }

    @Then("Click on Mobile Phone")
    public void click_on_mobile_phone() {
        cnpp.clickBtnMobilePhone();
    }

    @When("Enter Mobile Phone as {string}")
    public void enter_mobile_phone_as(String mobile) throws Exception{
        cnpp.setTxtMobilePhone(mobile);
    }

    @When("Clicks on the Create button")
    public void clicks_on_the_create_button() {
        cnpp.clickCreate();
    }

    //##########################################################Candidate - Plus Button Top - Add Candidate Review List########################################

    @When("user clicks on the Plus Top button")
    public void user_clicks_on_the_plus_top_button() {
        acrp.clickPlusBtnTop();
    }

    @When("User click on Candidate Review")
    public void user_click_on_candidate_review() {
        acrp.clickBtnCandidateReview();
    }

    @Then("User adds Notes reviews as {string}")
    public void user_adds_notes_reviews_as(String reviewNotes) {
        acrp.setTxtNotesReview(reviewNotes);
    }

    @When("User selects the Create button")
    public void user_selects_the_create_button() {
        acrp.clickBtnCreate();
    }

    //################################################Client - PlusButtonTop - Add Client To List#######################################################

    @Then("User click on Client link")
    public void user_click_on_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User clicks Client link item as {string}")
    public void user_clicks_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @Then("Selects List item")
    public void selects_list_item() throws Exception{
        aclp.clickLnkListItem();
    }

    @When("User clicks on Add button")
    public void user_clicks_on_add_button() throws Exception{
        aclp.clickBtnAdd();
    }

    //################################################Client - PlusButtonTop - Add Client To List - New List##########################################################

    @Then("User click on the Client link")
    public void user_click_on_the_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User click on the Client link item as {string}")
    public void user_click_on_the_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @When("User clicks on New List button")
    public void user_clicks_on_new_list_button() throws Exception{
        aclnlp.btnNewList();
    }

    @Then("User enters the List Name as {string}")
    public void user_enters_the_list_name_as(String listName) throws Exception{
        aclnlp.setTxtListName(listName);
    }

    @When("User select the Create button")
    public void user_select_the_create_button() {
        aclnlp.clickBtnCreate();
    }

    //###################################################Organisation - Plus Top Button - Add Alert To Record##############################

    @When("User click on the Menu button as {string}")
    public void user_click_on_the_menu_button_as(String menu) {
        arp.click(menu);
    }

    @Then("User click on the Organisation link")
    public void user_click_on_the_organisation_link() throws Exception{
        arp.clickBtnOrganisationLink();
    }

    @When("User click on the Organisation link item as {string}")
    public void user_click_on_the_organisation_link_item_as(String organisationItem) {
        arp.clickOrganisation_menu(organisationItem);
    }

    @When("User click on the Organisation link menu item as {string}")
    public void user_click_on_the_organisation_link_menu_item_as(String organisationMeniItem) {
        arp.clickOrganisation_menuitem(organisationMeniItem);
    }


    @When("User selects on Plus Top button")
    public void user_selects_on_plus_top_button() throws Exception{
        arp.clickBtnPlusTop();
    }

    @Then("User selects Add Alert button")
    public void user_selects_add_alert_button() throws Exception{
        arp.clickBtnAddAlert();
    }

    @Then("User selects Type")
    public void user_selects_type() throws Exception{
        arp.clickType_menuitem();
    }

    @When("User writes Reason as {string}")
    public void user_writes_reason_as(String reason) {
        arp.stTxtReason(reason);
    }

    @When("User selects Expiry Date")
    public void user_selects_expiry_date() {
        arp.clickOnBtnExpiryDate();
    }

    @Then("User clicks on button OK")
    public void user_clicks_on_button_ok() {
        arp.clickOnBtnOK();
    }

    @When("User click on button Add")
    public void user_click_on_button_add() {
        arp.clickOnBtnAdd();
    }

    //###########################################Organisation - Add Location To List#########################

    @When("User clicks on Menu button as {string}")
    public void user_clicks_on_menu_button_as(String menu) {
        oalp.click(menu);
    }

    @Then("User clicks on Organisation link")
    public void user_clicks_on_organisation_link() throws Exception{
        oalp.clickBtnOrganisationLink();
    }

    @When("User clicks on Organisation link item as {string}")
    public void user_clicks_on_organisation_link_item_as(String organisationItem) {
        oalp.clickOrganisation_menu(organisationItem);
    }

    @When("User clicks on Organisation link menu item as {string}")
    public void user_clicks_on_organisation_link_menu_item_as(String organisationMeniItem) {
        oalp.clickOrganisation_menuitem(organisationMeniItem);
    }

    @Then("User clicks on Add To List")
    public void user_clicks_on_add_to_list() throws Exception{
        oalp.clickBtnAddToList();
    }

    @When("User selects an Organisation")
    public void user_selects_an_organisation() throws Exception{
        oalp.clickRbtOrganisation();
    }

    @When("User Clicks on Add organisation")
    public void user_clicks_on_add_organisation() throws Exception{
        oalp.clickBtnAdd();
    }

    //#######################################Organisation - Create New Organisation List###############################

    @When("User click on Menu button as {string}")
    public void user_click_on_menu_button_as(String menu) {
        nolp.click(menu);
    }

    @Then("User click on Organisation link")
    public void user_click_on_organisation_link() throws Exception{
        nolp.clickBtnOrganisationLink();
    }

    @When("User click on Organisation link item as {string}")
    public void user_click_on_organisation_link_item_as(String organisationItem) {
        nolp.clickOrganisation_menu(organisationItem);
    }

    @When("User click on Organisation link menu item as {string}")
    public void user_click_on_organisation_link_menu_item_as(String organisationMeniItem) {
        nolp.clickOrganisation_menuitem(organisationMeniItem);
    }

    @Then("User click on Add To List")
    public void user_click_on_add_to_list() throws Exception{
        nolp.clickBtnAddToList();
    }

    @When("User clicks on the New List button")
    public void user_clicks_on_the_new_list_button() throws Exception{
        nolp.clickBtnNewList();
    }

    @When("User enters the new Organisation List Name as {string}")
    public void user_enters_the_new_organisation_list_name_as(String listName) throws Exception{
        nolp.setTxtListName(listName);
    }

    @When("User clicks on Add")
    public void user_clicks_on_add() throws Exception{
        nolp.setBtnAdd();
    }

    //#################################################Client - Link Candidate######################################################################

    @When("User clicks on the Top Three Dots")
    public void user_clicks_on_the_top_three_dots() throws Exception{
        clcp.setBtnTopThreeDots();
    }

    @Then("User clicks on Link Candidate")
    public void user_clicks_on_link_candidate() throws Exception{
        clcp.clickBtnLinkCandidate();
    }

    @When("User enters Candidate {string}")
    public void user_enters_candidate(String candidateName) throws Exception{
        clcp.setTxtCandidateName(candidateName);
    }

    @When("User clicks on select")
    public void user_clicks_on_select() {
        clcp.clickBtnSelect();
    }

    //################################################Client - Add Alert############################################################################

    @Then("User selects Client link")
    public void user_selects_client_link() throws Exception{
        caap.clickLnkClient();
    }

    @When("User selects Client link item as {string}")
    public void user_selects_client_link_item_as(String text) {
        caap.click(text);
    }

    @When("user click on the Plus Top button")
    public void user_click_on_the_plus_top_button() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        caap.clickBtnClientTopPlus();
    }

    @Then("Clicks on Add Alert")
    public void clicks_on_add_alert() throws Exception{
        caap.clickBtnAddAlert();
    }

    @When("User selects Alert Type")
    public void user_selects_alert_type() throws Exception{
        caap.clicksBtnAlertType();
    }

    @When("User adds alert to record")
    public void user_adds_alert_to_record() {
        caap.clickBtnAdd();
    }

    //##################################Candidate - Plus Top Button - Add To List###########################

    @Then("User clicks on Add To List button")
    public void user_clicks_on_add_to_list_button() throws Exception{
        catlp.clickBtnAddToList();
    }

    @Then("User selects a List")
    public void user_selects_a_list() throws Exception{
        catlp.clicksListItem();
    }

    @When("User clicks on Add candidate to list")
    public void user_clicks_on_add_candidate_to_list() {
        catlp.clickBtnAdd();
    }

    //##################################Candidate - Plus Plus Button - Add To List - New List###########################



    @Then("User clicks on New List")
    public void user_clicks_on_new_list() throws Exception{
        catlnlp.clickBtnNewList();
    }

    @When("user enters the new List Name {string}")
    public void user_enters_the_new_list_name(String listName) throws Exception{
        catlnlp.setTxtOnListName(listName);
    }

    @When("User clicks on create new list")
    public void user_clicks_on_create_new_list() {
        catlnlp.clickOnBtnCreate();
    }

    //###############################################Organisation - Edit List###########################################

    @Then("User clicks on Organisation list")
    public void user_clicks_on_organisation_list() throws Exception{
        oelp.clickLnkOrgList();
    }

    @When("User selects an Organisation list item")
    public void user_selects_an_organisation_list_item() throws Exception{
        oelp.clickBtnOrgList_item();
    }

    @Then("User selects the Organisation List link")
    public void user_selects_the_organisation_list_link() throws Exception{

    }

    @When("User clinks on Organisation list item")
    public void user_clinks_on_organisation_list_item() throws Exception{

    }

    @Then("User clicks on the Edit button")
    public void user_clicks_on_the_edit_button() throws Exception{
        oelp.clickBtnEdit();
    }

    @When("User edits List Name as {string}")
    public void user_edits_list_name_as(String listName) throws Exception{
        oelp.setTxtListName(listName);
    }

    @When("User clicks on Update edited organisation")
    public void user_clicks_on_update_edited_organisation() throws Exception{
        oelp.setBtnUpdate();
    }

    //##################################Organisation - Linked Jobs - Subsidiary Organisation############################

    @Then("User clicks on Linked Jobs link")
    public void user_clicks_on_linked_jobs_link() throws Exception{
        sop.clickLnkLinkedOrgs();
    }

    @When("User clicks on Subsidiary Plus button")
    public void user_clicks_on_subsidiary_plus_button() throws Exception{
        sop.clickBtnSubsidiaryOrganisation();
    }

    @When("User looks for Organisation Menu as {string}")
    public void user_looks_for_organisation_menu_as(String text) throws Exception{
        sop.setTxtOrganisation_menu(text);
    }

    @When("User clicks an Organisation Menu Items")
    public void user_clicks_an_organisation_menu_items() throws Exception{
        sop.clickOrganisationMenuItem();
    }


    @Then("User clicks on Select to create Subsidiary Organisation")
    public void user_clicks_on_select_to_create_subsidiary_organisation() throws Exception{
        sop.setBtnSelect();
    }

    //#########################################################Jobs - Add Alert#########################################


    @When("Click on the Plus Top button")
    public void click_on_the_plus_top_button() throws Exception{
        jaap.clickBtnTopPlus();
    }

    @Then("User clicks on  add Alert")
    public void user_clicks_on_add_alert() throws Exception{
        jaap.clickBtnAddAlert();
    }

    @Then("User select Type")
    public void user_select_type() throws Exception{
        jaap.clickType_menu();
    }

    @Then("User select Type Item")
    public void user_select_type_item() throws Exception{
        jaap.clickType_menuitem();
    }

    @When("User writes a Reason as {string}")
    public void user_writes_a_reason_as(String reason) {
        jaap.stTxtReason(reason);
    }

    @When("User select Expiry Date")
    public void user_select_expiry_date() {
        jaap.clickOnBtnExpiryDate();
    }

    @Then("User click on button OK")
    public void user_click_on_button_ok() {
        jaap.clickOnBtnOK();
    }

    @When("User clicks on button Add")
    public void user_clicks_on_button_add() {
        jaap.clickOnBtnAdd();
    }

    //###############################CandidateRecordModals-MandatoryLocationField#######################################

    @Then("User looks up for Organisation Menu as {string}")
    public void user_looks_up_for_organisation_menu_as(String oName) {

        mlfp.setTxtOrganisation_menu(oName);
    }

    @Then("User selects desired an Organisation Menu Item")
    public void user_selects_desired_an_organisation_menu_item() {
        //cjp.clickOrganisation_menuitem();
        mlfp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User enters nothing onLocation to validate if message appears {string}")
    public void user_enters_nothing_on_location_to_validate_if_message_appears(String location) throws Exception{
        mlfp.setTxtLocation_menuitem(location);
    }


    //############################################Client Contact Record - Jobs Tab######################################

    @When("User clicks on Jobs link")
    public void user_clicks_on_jobs_link() throws Exception{
        ccrjp.clickBtnLinkJobs();
    }

    @Then("clicks on the Job Item")
    public void clicks_on_the_job_item() throws Exception{
        ccrjp.clickBtnJobItem();
    }

    //#########################################Client Contact Record - Remove Candidate################################

    @When("User clicks on Three Dots button")
    public void user_clicks_on_three_dots_button() throws Exception{
        ccrrcp.clickBtnThreeDots();
    }

    @Then("clicks on unlink Candidate button")
    public void clicks_on_unlink_candidate_button() throws Exception{
        ccrrcp.clickBtnUnlinkCandidate();
    }

    //#######################################Candidate Activity Edit Activity###########################################

    @When("User clicks on Edit Activity link")
    public void user_clicks_on_edit_activity_link() {
    }


    //##########################################Candidate Remove Client Contact#########################################

    @Then("User clicks on Remove Client Contact")
    public void user_clicks_on_remove_client_contact() {
        lop.clickBtnLinkClientContact();
    }

    //#########################################FE-Change Stage dropdown#####################################

    @When("User clicks on Job link item as {string}")
    public void user_clicks_on_job_link_item_as(String text) {
        fecsdp.clickLnkJobItem_menu(text);
    }

    @When("User clicks on Short list link")
    public void user_clicks_on_short_list_link() throws Exception{
        fecsdp.clickLnkShortList();
    }

    @Then("User clicks on Job Checkbox")
    public void user_clicks_on_job_checkbox() throws Exception{
        fecsdp.clickJobCheckboxItem();
    }

    @When("User clicks on Change Stage link")
    public void user_clicks_on_change_stage_link() throws Exception{
        fecsdp.clickLnkChangeStage();
    }

    @When("User clicks on Job record")
    public void user_clicks_on_job_record() throws Exception{
        fecsdp.clickBtnReject();
    }
    //###############################################PipelineManagement-EmptyStatesforGrid######################################################

    @When("User clicks on a Job link item as {string}")
    public void user_clicks_on_a_job_link_item_as(String jobItem) {
        pmesgp.clickLnkJobItem(jobItem);
    }

    @When("User clicks on Long list link")
    public void user_clicks_on_long_list_link() throws Exception{
        pmesgp.clickLnkLongList();
    }

    //#########################################Candidate Activity - Edit Activity##############################################################

    @Then("User searches for an Organisation Menu as {string}")
    public void user_searches_for_an_organisation_menu_as(String text) throws Exception{
        caeap.getTxtOrganisationMenu(text);
    }

    @When("User selects Organisation Menu Items")
    public void user_selects_organisation_menu_items() throws Exception{
        caeap.clickOrganisationMenuItem();
    }

    @When("User click on Edit Activity link")
    public void user_click_on_edit_activity_link() {
        caeap.clickLnkEditActivity();
    }

    @When("User clicks on the Save button")
    public void user_clicks_on_the_save_button() throws Exception{
        caeap.clickBtnSave();
    }

    //###########################################Organisation - Edit Activity###########################################

    @Then("User selects the Organisation link")
    public void user_selects_the_organisation_link() throws Exception{
        oeap.clickBtnOrganisation_menu();
    }


    @Then("User clinks on Organisation item")
    public void user_clinks_on_organisation_item() throws Exception{
        oeap.clickLnkOrganisation_item();
    }

    @When("User edits an Activity")
    public void user_edits_an_activity() {
        oeap.clickLnkEditActivity();
    }

    @Then("User enters Candidate")
    public void user_enters_candidate() throws Exception{
        oeap.setTxtCandidate();
    }

    @When("User selects Job")
    public void user_selects_job() throws Exception{
        oeap.clickBtnJob_menu();
    }

    //#######################################Jobs - Edit Activity################################################

    @Then("User selects My Jobs link")
    public void user_selects_my_jobs_link() throws Exception{
        jeap.clickLnkMyJobs();
    }

    @When("User selects a Job link item as {string}")
    public void user_selects_a_job_link_item_as(String job) throws Exception{
        jeap.clickLnkJobItem();
    }

    @When("User click on Activity link")
    public void user_click_on_activity_link() throws Exception{
        jeap.clickLnkActivity();
    }

    //#########################################Login New Page#####################################################

    @Then("User enters their Username as {string}")
    public void user_enters_their_username_as(String username) throws Exception{
        lgnp.setTxtUsername(username);
    }

    @When("User enters their Password as {string}")
    public void user_enters_their_password_as(String password) throws Exception{
        lgnp.setTxtPassword(password);
    }

    @When("User clicks on the SignIn button")
    public void user_clicks_on_the_sign_in_button() throws Exception{
        lgnp.clickBtnSignIn();
    }

    //####################################Candidate - View Activity - Activity - Filter#############################

    @Then("User clicks on the Filter Activities button")
    public void user_clicks_on_the_filter_activities_button() throws Exception{
        cvafp.clickBtnFilterActivities();
    }

    @When("User clicks on the Email radio button")
    public void user_clicks_on_the_email_radio_button() throws Exception{
        cvafp.clickRdBtnEmail();
    }

    //##############################################FE - GRID VIEW - OFFER/PLACED###################################

    @When("User clicks on Offer link")
    public void user_clicks_on_offer_link() throws Exception{
        gvop.clickLnkOffers();
    }

    //#########################################FE - Add candidate to Job - Transition to Longlist######################

    @Then("User click on Candidate menu item")
    public void user_click_on_candidate_menu_item() throws Exception{
        acjtlp.clickLnkCandidateItem();
    }

    @Then("User clicks on Add to List or Job")
    public void user_clicks_on_add_to_list_or_job() throws Exception{
        acjtlp.clickBtnAddToListOrJob();
    }

    @When("User clicks on Add to Job")
    public void user_clicks_on_add_to_job() throws Exception{
        acjtlp.clickBtnAddToJob();
    }



    @When("User selects a Job link item")
    public void user_selects_a_job_link_item() throws Exception{
        acjtlp.clickRdBtnJobItem();
    }

    @Then("User clicks ADD")
    public void user_clicks_add() throws Exception{
        acjtlp.clickBtnAdd();
    }

    //####################################FE - Add candidate to Job - Transition to Longlist###########################

    @When("User click on a Job link item")
    public void user_click_on_a_job_link_item() throws Exception{
        dttslp.clickLnkJobItem();
    }

    @When("User clicks on link Short List")
    public void user_clicks_on_link_short_list() throws Exception{
        dttslp.clickLnkShortList();
    }

    @When("User clicks on left pane Short List")
    public void user_clicks_on_left_pane_short_list() throws Exception{
        dttslp.clickLnkLeftPaneShortListt();
    }

    //########################################FE-Organisation-CreateActivity-ActivityModal##############################

    @When("User clicks on organisation scrollable")
    public void user_clicks_on_organisation_scrollable() throws Exception{
        ocamp.clickLnkOrganisationScrollable();
    }

    @Then("User clicks on the organisation item")
    public void user_clicks_on_the_organisation_item() throws Exception{
        ocamp.clickLnkOrganisationItem();
    }

    @Then("User clicks on organisation activity plus button")
    public void user_clicks_on_organisation_activity_plus_button() throws Exception{
        ocamp.clickBtnOrgPlus();
    }

    @When("User enters organisation Activity Type")
    public void user_enters_organisation_activity_type() throws Exception{
        ocamp.clickBtnActivityType_menu();
    }

    @When("User searches for Client Contact Menu as {string}")
    public void user_searches_for_client_contact_menu_as(String clintContact) throws Exception{
        ocamp.setTxtMainClientContact_menu(clintContact);
    }

    @Then("User selects an Client Contact Menu Item")
    public void user_selects_an_client_contact_menu_item() throws Exception{
        ocamp.clickMainClientContactMenuItem();
    }

    @When("User clicks on Create Organisation Activity")
    public void user_clicks_on_create_organisation_activity() throws Exception{
        ocamp.clickBtnCreateOrgActivity();
    }

    //###############################################FE-ClientContact-CreateActivity-Activity Modal#####################

    @Then("User click on open search button")
    public void user_click_on_open_search_button() throws Exception{
        cccamp.clickBtnOpenSearch();
    }

    @When("User searches for client contact as {string}")
    public void user_searches_for_client_contact_as(String text) throws Exception{
        cccamp.getTxtSearchField(text);
    }

    @When("User clicks on client contact scrollable")
    public void user_clicks_on_client_contact_scrollable() throws Exception{
        cccamp.clickBtnCCScrollable();
    }

    @Then("User clicks on the client item")
    public void user_clicks_on_the_client_item() throws Exception{
        cccamp.clickLnkClientItem();
    }

    @Then("User clicks on Client Contact activity plus button")
    public void user_clicks_on_client_contact_activity_plus_button() throws Exception{
        cccamp.clickBtnCCPlus();
    }

    @When("User clicks on Create Client Contact Activity")
    public void user_clicks_on_create_client_contact_activity() throws Exception{
        cccamp.clickBtnCreateCCActivity();
    }

    //###############################################FE-Job-CreateActivity-ActivityModal################################

    @Then("User clicks on the Job Plus button")
    public void user_clicks_on_the_job_plus_button() throws Exception{
        jcamp.clickBtnJobPlus();
    }

    @When("User enters Job Activity Type")
    public void user_enters_job_activity_type() throws Exception{
        jcamp.clickBtnActivityType_menu();
    }

    //###############################################Organisation-LinkAnOrganisationToAClient###########################

    @When("User clicks on Client Contacts link")
    public void user_clicks_on_client_contacts_link() throws Exception{
        olocp.clickLnkClientContacts();
    }

    @Then("User selects a client radio button")
    public void user_selects_a_client_radio_button() throws Exception{
        olocp.clickRdBtnClient();
    }

    @When("User clicks on Add To")
    public void user_clicks_on_add_to() throws Exception{
        olocp.clickBtnAddTo();
    }

    @When("User click on Add To List button")
    public void user_click_on_add_to_list_button() throws Exception{
        olocp.clickBtnAddToList();
    }

    //###############################################Organisation-PlusTopBtn-AddAlertToRecord###########################

    @Then("User clicks on the Add alert button")
    public void user_clicks_on_the_add_alert_button() throws Exception{
        opbaatrp.clickBtnAddAlert();
    }

    //oaatrp

    //########################################FE - Edit - Interview Rounds - Single Or Multi - Additional Round####################################


    @Then("User click on Job Checkbox")
    public void user_click_on_job_checkbox() throws Exception{
        eirsomadp.clickBtnCheckbox();
    }

    //###########################################Organisation - Location - Edit Location################################

    @When("User clicks on Locations Tab")
    public void user_clicks_on_locations_tab() throws Exception{
        orlelp.clickBtnLocationTab();
    }

    @Then("User clicks on the Three Dots to Edit Location")
    public void user_clicks_on_the_three_dots_to_edit_location() throws Exception{
        orlelp.clickBtnThreeDots();
    }

    @When("User clicks on Edit Location")
    public void user_clicks_on_edit_location() throws Exception{
        orlelp.clickBtnEditLocation();
    }

    @Then("User clicks on the OK button")
    public void user_clicks_on_the_ok_button() throws Exception{
        orlelp.clickBtnOK();
    }


    @When("User enters Address Line One as {string}")
    public void user_enters_address_line_one_as(String addressLineOne) throws Exception{
        orlelp.setTxtAddressLineOne(addressLineOne);
    }

    @Then("User enters Province as {string}")
    public void user_enters_province_as(String province) throws Exception{
        orlelp.setTxtProvinceName(province);
    }

    @When("User enters the Post Code as {string}")
    public void user_enters_the_post_code_as(String postCode) throws Exception{
        orlelp.setTxtPostCodeNumber(postCode);
    }

    @When("Clicks on radio button Make this primary location")
    public void clicks_on_radio_button_make_this_primary_location() throws Exception{
        orlelp.clickRdBtnMakeThisPrimaryLocation();
    }

    @When("User clicks on to the Save button")
    public void user_clicks_on_to_the_save_button() throws Exception{
        orlelp.clickBtnSave();
    }

    //######################################Organisation -Add List######################################################

    @Then("User select the Organisation List link")
    public void user_select_the_organisation_list_link() throws Exception{
        oalnp.clickLnkOrganisationList();
    }

    @Then("User clicks on Add List button")
    public void user_clicks_on_add_list_button() throws Exception{
        oalnp.clickBtnAddList();
    }

    @Then("User Enters new List Name as {string}")
    public void user_enters_new_list_name_as(String listName) throws Exception{
        oalnp.getTxtListName(listName);
    }

    @When("User clicks on Create Org List")
    public void user_clicks_on_create_org_list() throws Exception{
        oalnp.clickBtnCREATE();
    }

    //########################FE - Implement Pagination To Transition To Offer Stage - Single or Multi##################

    @Then("User clicks on Additional Rounds")
    public void user_clicks_on_additional_rounds() throws Exception{
        iptos.clickLnkAdditionalRounds();
    }

    @Then("User selects all checkboxes")
    public void user_selects_all_checkboxes() throws Exception{
        iptos.clickRdBtnCheckBox();
    }

    @When("User clicks on link Offer")
    public void user_clicks_on_link_offer() throws Exception{
        iptos.clickBtnOffer();
    }

    @When("User clicks on Offer Date")
    public void user_clicks_on_offer_date() throws Exception{
        iptos.clickLnkOfferDate();
    }

    @Then("User selects Date")
    public void user_selects_date() throws Exception{
        iptos.clickLnkSelectOfferDate();
    }

    @When("User enter Salary as {string}")
    public void user_enter_salary_as(String salary) throws Exception{
        iptos.setTxtSalary(salary);
    }

    @When("User enters Activity Notes as {string}")
    public void user_enters_activity_notes_as(String activityNotes) throws Exception{
        iptos.setTxtActivityNotes(activityNotes);
    }

    @Then("User clicks on Save and Continue button")
    public void user_clicks_on_save_and_continue_button() throws Exception{
        iptos.clickBtnSaveAndContinue();
    }

    //##########################################FE And BE Transition To CV Sent Stage Single/Multi Page#################


    @When("User clicks on link Send CV")
    public void user_clicks_on_link_send_cv() throws Exception{
        ttcvs.clickBtnSendCV();
    }

    @When("User clicks on Responsible User Menu")
    public void user_clicks_on_responsible_user_menu() throws Exception{
        ttcvs.setTxtResponsibleUser();
    }

    @Then("User selects Responsible User Item")
    public void user_selects_responsible_user_item() throws Exception{
        ttcvs.setTxtResponsibleUserItem();
    }

    @Then("User selects an Client Contact Menu")
    public void user_selects_an_client_contact_menu() throws Exception{
        ttcvs.setTxtClientContact();
    }

    @When("User selects an Client Contact item")
    public void user_selects_an_client_contact_item() throws Exception{
        ttcvs.setTxtClientContactItem();
    }



    @When("User clicks on the Save button to send submit")
    public void user_clicks_on_the_save_button_to_send_submit() throws Exception{
        ttcvs.clickBtnSave();
    }


    //##############################################FE - Direct Transition to Placed####################################

    @When("User clicks on the link Send CV")
    public void user_clicks_on_the_link_send_cv() throws Exception{
        dttpp.clickLnkSendCV();
    }

    @When("User clicks on the Offer button")
    public void user_clicks_on_the_offer_button() throws Exception{
        dttpp.clickBtnOffer();
    }

    //################################FE-TransitionToInterviewRounds(1st,2nd,Add)-SingleOrMulti#########################

    @When("User clicks on CV Sent link")
    public void user_clicks_on_cv_sent_link() throws Exception{
        ttirfstp.clickBtnCVSent();
    }

    @When("User clicks on First Round link")
    public void user_clicks_on_first_round_link() throws Exception{
        ttirfstp.clickLnkFirstRound();
    }

    //#########################################FE-Edit-CVSentModal-SingleOrMulti########################################

    @When("User clicks Edit Activity link")
    public void user_clicks_edit_activity_link() throws Exception{
        ecvmp.clickBtnCVSent();
    }

    @When("User selects an Outcome")
    public void user_selects_an_outcome() throws Exception{
        ecvmp.clickBtnOutcome_menu();
    }

    @Then("User selects an Outcome date")
    public void user_selects_an_outcome_date() throws Exception{
        ecvmp.clickOutcomeDate();
    }

    @When("User clicks on Save")
    public void user_clicks_on_save() throws Exception{
        ecvmp.clickBtnSave();
    }

    //############################################FE-TransitionToFollow-UpAdditionalRounds##############################

    @When("User clicks on First Round link button")
    public void user_clicks_on_first_round_link_button() throws Exception{
        ttfarp.clickGetBtnFirstRound();
    }

    @Then("User clicks on Second Round link")
    public void user_clicks_on_second_round_link() throws Exception{
        ttfarp.clickBtnSecondRound();
    }

    @When("User clicks on link Second Round")
    public void user_clicks_on_link_second_round() throws Exception{
        ttfarp.clickGetBtnSecondRound();
    }

    @Then("User clicks on Additional Round")
    public void user_clicks_on_additional_round() throws Exception{
        ttfarp.clickLnkAdditionalRound();
    }

    //###################################AL-Candidates-CreateViewEditMarketingEvents-Filter#############################

    @When("User selects on the Candidate {string}")
    public void user_selects_on_the_candidate(String string) throws Exception{
        ccvemefp.clickLnkCandidate();
    }

    @When("User clicks on the Marketing radio button")
    public void user_clicks_on_the_marketing_radio_button() throws Exception{
        ccvemefp.clickRdMarketing();
    }

    //###############################################AL-CC-CreateViewEditMarketingEvents################################



    @When("User enters an organisation Activity Type")
    public void user_enters_an_organisation_activity_type() throws Exception{
        alccvemep.clickActivityTypeMenu();
    }

    @When("User enters an organisation Activity Type Item")
    public void user_enters_an_organisation_activity_type_item() throws Exception{
        alccvemep.clickActivityTypeItem();
    }

    //#############################################AL-CC-CreateViewEditMarketingEvents- Client Event####################

    @When("User selects an organisation Activity Type")
    public void user_selects_an_organisation_activity_type() throws Exception{
        alcccvemecep.clickActivityTypeMenu();
    }

    @When("User selects an organisation Activity Type Item")
    public void user_selects_an_organisation_activity_type_item() throws Exception{
        alcccvemecep.clickActivityTypeItem();
    }


    //#############################AL-Candidates-CreateViewEditMarketingEvents- Candidate Event#########################

    @When("User enters an organisation Activity Type for a Candidate")
    public void user_enters_an_organisation_activity_type_for_a_candidate() throws Exception{
        alcccvemecanep.clickActivityTypeItemC();
    }

    //######################################FE - Candidate Record Preview Panel Refactor################################

    @When("User select a Job link item as {string}")
    public void user_select_a_job_link_item_as(String jobItem) throws Exception{
        crpprp.clickJobItem(jobItem);
    }

    @Then("User clicks on the candidate")
    public void user_clicks_on_the_candidate() {
        crpprp.clickLnkCandidate();
    }

    @Then("User clicks on the Expand button")
    public void user_clicks_on_the_expand_button() {
        crpprp.clickBtnExpand();
    }

    @When("User clicks on the Back button")
    public void user_clicks_on_the_back_button() {
        driver.navigate().back();
    }

    @Then("User clicks on the X button to exit")
    public void user_clicks_on_the_x_button_to_exit() {
        crpprp.clickBtnX();
    }

    //####################################FE & BE - Stage logic for outcome status - Rejected###########################

    @Then("User clicks link scrollable Job")
    public void user_clicks_link_scrollable_job() throws Exception{
        slfosr.clickLnkScrollableJob();
    }

    @When("User clicks on a Job link item")
    public void user_clicks_on_a_job_link_item() throws Exception{
        slfosr.clickLnkJobItem();
    }

    @When("User selects Edit Activity button")
    public void user_selects_edit_activity_button() throws Exception{
        slfosr.clickEditActivity();
    }

    @Then("User clicks on Outcome menu")
    public void user_clicks_on_outcome_menu() throws Exception{
        slfosr.clickBtnOutcome();
    }

    @Then("User selects an Outcome item")
    public void user_selects_an_outcome_item() throws Exception {
        slfosr.clickBtnOutcomeItem();
    }

    @Then("User select an Outcome item")
    public void user_select_an_outcome_item() throws Exception{
        slfosr.clickBtnOutcomeItemTwo();
    }

    @When("User click on the OK button")
    public void user_click_on_the_ok_button() throws Exception{
        slfosr.clickBtnOK();
    }

    //#################################FE & BE - Stage logic for outcome status - Wrong Entry###########################


    @When("User select Job link item as {string}")
    public void user_select_job_link_item_as(String string) throws Exception{
        slfoswe.clickLnkJobItem();
    }

    //################################################FE - Reject candidate flow########################################

    @When("User clicks on the Job link item as {string}")
    public void user_clicks_on_the_job_link_item_as(String string) throws Exception{
        rcfp.clickLnkJobItem();
    }

    @Then("User clicks on the Reject button")
    public void user_clicks_on_the_reject_button() throws Exception{
        rcfp.clicksBtnReject();
    }

    @Then("User select an Outcome date")
    public void user_select_an_outcome_date() throws Exception{
        rcfp.clickLnkOutcomeDate();
    }

    @When("User clicks on the Save")
    public void user_clicks_on_the_save() throws Exception{
        rcfp.clickBtnSave();
    }

    //######################################FE - Unreject candidates - Single/Multi#####################################

    @Then("User clicks on unreject button")
    public void user_clicks_on_unreject_button() throws Exception{
        ucsomp.clickBtnUnreject();
    }


    //#########################################FE Permissions: Role Based - Organisation################################

    @When("User clinks on the Organisation item")
    public void user_clinks_on_the_organisation_item() throws Exception{
        prbop.clickLnkOrganisationItem();
    }

    //#########################################FE Permissions: Role Based - Job#########################################

    @When("user click on Save")
    public void user_click_on_save() throws Exception{
        prbjp.clicksBtnSave();
    }

    //###########################################FE: Candidate Edit Activity Log Activity###############################

    @Then("User clicks on the Candidates")
    public void user_clicks_on_the_candidates() throws Exception{
        cealap.clickLnkCandidates();
    }

    @When("User clicks on a Candidate Item")
    public void user_clicks_on_a_candidate_item() throws Exception{
        cealap.clickLnkCandidatesItem();
    }

    @When("User select an Client Contact Menu Item as {string}")
    public void user_select_an_client_contact_menu_item_as(String clientContact) throws Exception{
        cealap.setTxtClientContact(clientContact);
    }

    @When("User selects a desired Outcome")
    public void user_selects_a_desired_outcome() throws Exception{
        cealap.clickBtnOutcome();
    }








    //##################################################DATA - Jobs Record##############################################

    @Then("User enters the Background info as {string}")
    public void user_enters_the_background_info_as(String backgroundInfo) throws Exception{
        jp.setTxtBackgroundInfo(backgroundInfo);
    }

    @Then("Click on the Create button")
    public void click_on_the_create_button() throws Exception{
        jp.clickOnBtnCreate();
    }


    /*
        THIS IS JUST FOR EXPERIMENTAL PURPOSES
     */

    @Given("I have opened the Login page")
    public void iHaveOpenedTheLoginPage() throws Exception {
        glob_loginPage.OpenPage();
    }

    @Given("I have logged into the application")
    public void iHaveLoggedIntoTheApplication() throws Exception {
        // Enter Email details
        glob_loginPage.emailTextField.sendKeys("jjonzz@digitalzenith.io");
        // Enter password
        glob_loginPage.passwordField.sendKeys("MartianM@nhunt3r");
        // Submit the login details
        glob_loginPage.submitButton.click();
        // Verify you have logged in by verifying the Universal Plus icon is visible
        glob_hudPage.WaitForElementToBeVisible(glob_hudPage.universalPlusIcon);
    }

    @When("I create a new candidate via the Plus Icon")
    public void iCreateANewCandidateViaThePlusIcon() {
        iCreateANewCandidateViaThePlusIcon("Tony Stark");
    }

    /*
        Candidate Tests
    */

    @When("I create a new candidate via the Plus Icon with the name {string}")
    public void iCreateANewCandidateViaThePlusIcon(String fullName) {
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateCandidate));
        glob_hudPage.universalPlusIcon_CreateCandidate.click();
        /* Set Personal Details */
//        CandidateDetails.familyName = fullName.split(" ")[0];
//        CandidateDetails.familyName = fullName.split(" ")[1];
//        create_newCandidatePage.firstNameTextfield.sendKeys(CandidateDetails.familyName);
//        create_newCandidatePage.familyNameTextfield.sendKeys(CandidateDetails.familyName);
        create_newCandidatePage.ciyTextfield.sendKeys("Cape Town ");
        /* Set Contact Details */
        create_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(create_newCandidatePage.contact_MobileNumber));
        create_newCandidatePage.contact_MobileNumber.click();
        Date date  = new Date();
        actions.sendKeys("0999999999" + Keys.ENTER).perform();
        create_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(create_newCandidatePage.contact_EmailAddress));
        create_newCandidatePage.contact_EmailAddress.click();
        actions.sendKeys("testers@test.com" + Keys.ENTER).perform();
        /* Set Current Role Details */
        /* Set Looking for Details */
        /* Set Candidate Registration Details */
        /* Set Interview Notes */

        // Submit
        create_newCandidatePage.createButton.click();
    }



//    @Then("verify I can view the new candidate")
//    public void verifyICanViewTheNewCandidate() throws IOException {
//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.notification_CreatedCandidate));
//        assertThat(glob_hudPage.notification_CreatedCandidate.getText(), containsString(CandidateDetails.firstName+" "+ CandidateDetails.familyName));
//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.notification_ViewRecordButton));
//        glob_hudPage.notification_ViewRecordButton.click();
//        create_candidateRecordPage.candidateFullName(CandidateDetails.firstName+" "+ CandidateDetails.familyName);
//        CandidateDetails.pageURL = driver.getCurrentUrl();
//        setTestData_CandidateURL(driver.getCurrentUrl());
//        System.out.println(CandidateDetails.pageURL);
//    }

    @Given("I have searched for the Candidate named {string}")
    public void iHaveSearchedForTheCandidateNamed(String fullyName) {
    }

    @Given("I have navigated to the Candidate created during Testing")
    public void iHaveSearchedForTheCandidateNamed() throws IOException {
        driver.get(UsefulMethods.getTestData_CandidateURL());
    }

    @Given("I have Logged via the backend and stored id token")
    public void iHaveLoggedInViaTheBackEndAndStoredTheIdToken() {

        String baseURL = null;
        String clientID = null;
        if(System.getProperty("env").equals("sit")){
            baseURL = "https://authsit.digitalzenith.io";
            clientID = "0bb1fef9-57a1-4b5d-809b-8e8d873f79d9";
        } else if (System.getProperty("env").equals("dev")) {
            baseURL = "https://authdev.digitalzenith.io";
            clientID = "d13f746b-1ce3-4897-9b07-a73f78809fda";
        }
        RestAssured.baseURI = baseURL;
        Response response =
                given()
                        .params("grant_type", "password")
                        .params("client_id", clientID)
                        .params("loginId", "ckent@digitalzenith.io")
                        .params("password", "Superm@n")
                        .params("scope", "openid")
                        //.body(requestBody)
                        .when()
                        .post("/oauth2/token");

        UsefulMethods.access_token = response.body().jsonPath().getJsonObject("access_token");
        UsefulMethods.id_token = response.body().jsonPath().getJsonObject("id_token");
        Assert.assertEquals(200,response.statusCode());
        System.out.println("1. Login Success Details -----------------------------------------------------------");
        System.out.println(response.getBody().prettyPeek());
        System.out.println("------------------------------------------------------------------------------------");

    }

    @Given("I have deleted Candidate with the family name {string}")
    public void iHaveDeletedCandidateWithTheFamilyName(String familyName) {

        String baseURL = null;
        if(System.getProperty("env").equals("sit")){
            baseURL = "https://apisit.digitalzenith.io";
        } else if (System.getProperty("env").equals("dev")) {
            baseURL = "https://apidev.digitalzenith.io";
        }

        // This class is ued to create the GraphQL Query needed to seach for all Candidates with a specific family name
        // And to return all the ID's
        class GraphQLQuery {

            private String query;

            public void setQuery(String query) {
                this.query = query;
            }

            public String getQuery() {
                return query;
            }
        }

        GraphQLQuery query = new GraphQLQuery();
        query.setQuery("{ ksql_refactor_v_candidate_library {\n" +
                "        Candidates(where: {family_name: {_ilike: \"%"+familyName+"%\"}}) {\n" +
                "          id\n" +
                "        }\n" +
                "      } }");

        // This is currently hardcoded to DEV. A more elegant solution would be to store this somewhere else
        RestAssured.baseURI = baseURL;
        System.out.println("2. GraphQL Query -------------------------------------------------------------");
        System.out.println(query.getQuery());

        System.out.println("------------------------------------------------------------------------------");
        Response response =
                given()
                        .header("Authorization", "Bearer "+UsefulMethods.id_token)
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .body(query)
                        .when()
                        .post("/query/graphql/v1/graphql");
        System.out.println("3. GraphQL Response ----------------------------------------------------------");
        response.getBody().prettyPrint();
        System.out.println("------------------------------------------------------------------------------");
        Assert.assertEquals(200,response.statusCode());
        // Now we have a list of Candidate ID's
        List<Map<String,String>> candidateListIDs = response.jsonPath().getJsonObject("data.ksql_refactor_v_candidate_library[0].Candidates");

        // For each ID found we run the DELETE api call
        // Run the delete script if any Candidate ID's were found
        System.out.println("4. Records Deleted ---------------------------------------------------------");
        if(!candidateListIDs.equals(null)){
            for(Map<String,String> candidate : candidateListIDs){
                Response response2 =
                        given()
                                .header("Authorization", "Bearer "+UsefulMethods.access_token)
                                .when()
                                .delete("/command/candidates/"+candidate.get("id"));
                assertThat(response2.getStatusCode(),equalTo(202));
                System.out.println("Deleted ID = " + response2.getBody().prettyPrint());
            }
        }else{
            System.out.println("No Candidates found with family name - " + familyName);
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    //###################################################################################################################

    /*
        LUNGA'S
        THIS IS JUST FOR EXPERIMENTAL PURPOSES
     */

    @When("I create a new Organisation via the Plus Icon with orgName {string}")
    public void i_create_a_new_organisation_via_the_plus_icon_with_org_name(String orgName) {
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateOrganisation));
        glob_hudPage.universalPlusIcon_CreateOrganisation.click();

        lunga_createOrganisationPage.OrganisationNameTextField.sendKeys("LungasNewOrg");

        /** *Set Location Details* **/
        lunga_createOrganisationPage.LocationNameTextField.sendKeys("Cape Town");

        /** Country **/
        wait.until(ExpectedConditions.visibilityOf(lunga_createOrganisationPage.CountryNameTextField));
        lunga_createOrganisationPage.CountryNameTextField.click();
        wait.until(ExpectedConditions.visibilityOf(lunga_createOrganisationPage.CountryMenuItem));
        lunga_createOrganisationPage.CountryMenuItem.click();

        /** City/Town/Suburb **/
        lunga_createOrganisationPage.CityNameTextField.sendKeys("Bellville");

        lunga_createOrganisationPage.btnCreate.click();
    }

    @Then("I verify that I can view the new organisation")
    public void i_verify_that_i_can_view_the_new_organisation() {
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.notification_CreatedOrganisation));
        assertThat(glob_hudPage.notification_CreatedOrganisation.getText(), containsString("LungasNewOrg"));
    }

    //##########################################BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_ShortListPage#################

    @When("I edit shortlist modal and Add responsible user and team")
    public void i_edit_shortlist_modal_and_add_responsible_user_and_team() {
        /** Open Menu
         *  Click on Jobs and then select a Job
         */
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkShortList));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkShortList.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam_item.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtActivityNotes));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtActivityNotes.sendKeys("Just a test");

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnOutcome));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnOutcome.click();
//
//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcome_item));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcome_item.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcomeDate));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcomeDate.click();
//
//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcomeDate_item));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.getBtnOutcomeDate_item.click();


        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();

    }

    //#####################################################BE & FE - Pipeline edit modals - Add responsible user and team SecondRoundPage#######################


    @When("I edit Second Round modal and Add responsible user and team")
    public void i_edit_second_round_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.lnkSecondRound));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.lnkSecondRound.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();

    }

    //######################################################BE & FE - Pipeline edit modals - Add responsible user and team - Placed################

    @When("I edit Placed modal and Add responsible user and team")
    public void i_edit_placed_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();

    }

    //############################################BE & FE - Pipeline edit modals - Add responsible user and team - Offer#########################

    @When("A user edits Offer modal and Add responsible user and team")
    public void a_user_edits_offer_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.txtResponsibleUser_item.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //######################################################BE & FE - Pipeline edit modals - Add responsible user and team - Long List###########################

    @When("I edit Long List modal and Add responsible user and team")
    public void i_edit_long_list_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeamLongListPage.lnkLongList));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeamLongListPage.lnkLongList.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();

    }

    //################################################BE & FE - Pipeline edit modals - Add responsible user and team - First Round######################

    @When("I edit First Round modal and Add responsible user and team")
    public void i_edit_first_round_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_firstRoundPage.lnkFirstRound));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_firstRoundPage.lnkFirstRound.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.txtResponsibleUser_item.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //#############################################BE & FE - Pipeline edit modals - Add responsible user and team - CV Sent#####################################


    @When("I edit CV Sent modal and Add responsible user and team")
    public void i_edit_cv_sent_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();


        wait.until(ExpectedConditions.elementToBeClickable(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkCVSent));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkCVSent.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //##########################################################BEAndFE_Pipeline_EditModals_AddResponsibleUserAndTeam_AdditionalRounds###################

    @When("I edit modal and add responsibleUser and team in Additional rounds")
    public void i_edit_modal_and_add_responsible_user_and_team_in_additional_rounds() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_additionalRoundsPage.lnkAdditionalRound));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_additionalRoundsPage.lnkAdditionalRound.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item.click();

        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //################################################FE - Activity Log - Create Modal - Add Responsible User, Team, Other Consultants#########################

    @When("I create a new Client Contact - Activity modal")
    public void i_create_a_new_client_contact_activity_modal() throws Exception{

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnCCPlus));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnCCPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnActivityType));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnActivityType.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnActivityType_item));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnActivityType_item.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants.sendKeys("Alex Berry");

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants_item));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants_item.click();

        //feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnCreateActivity.click();

    }

    //################################################FE & BE - Candidate - Status not updating or setting to correct default value####################

    @When("I create a new Candidate to check if Status has updated")
    public void i_create_a_new_candidate_to_check_if_status_has_updated() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();

    }

    @Then("verify I can view the candidate status update")
    public void verify_i_can_view_the_candidate_status_update() {
        wait.until(ExpectedConditions.visibilityOf(feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage.btnStatusDropdown));
        assertThat(feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage.btnStatusDropdown.getText(), containsString("Active"));
        System.out.println("true");
    }

    //#############################################FEO/BE - Activity log - Edit Modal - Add Responsible User, Team & Other Consultants#####################

    @When("User Add Responsible User and Team and Other Consultants")
    public void user_add_responsible_user_and_team_and_other_consultants() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage.btnEditActivityCVSent));
        feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage.btnEditActivityCVSent.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants));
//        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants.sendKeys("Alec Holland");
//
//        //wait.until(ExpectedConditions.visibilityOf(feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage.txtOtherConsultant_menuitem));
//        feOrBE_activityLog_editModal_addResponsibleUser_team_other_consultantsPage.txtOtherConsultant_menuitem.click();

        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //###################################################Fe/Be:L Job - Create Job Modal - Add & View Responsible User, Team########################################

    @When("User Creates Job Modal - Add & View Responsible User, Team")
    public void user_creates_job_modal_add_view_responsible_user_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateJob));
        glob_hudPage.universalPlusIcon_CreateJob.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName.sendKeys("LuJobTwo");

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_menu.sendKeys("Lung");

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_item));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_item.click();

        wait.until(ExpectedConditions.elementToBeClickable(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu.click();

        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.txtLocation_menuitem));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.txtLocation_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_secondRoundPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu));
//        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu.click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu));
//        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu.click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menuitem));
//        //Thread.sleep(3000);
//        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menuitem.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.aggreementType_menu));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.aggreementType_menu.click();
//
//        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.aggreementType_menuitem));
//        fe_dialogBox_retainerOrShortlist_createJobModalPage.aggreementType_menuitem.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menu));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menu.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menuitem));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menuitem.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menu_lookup));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menu_lookup.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menuitem));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menuitem.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menu));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menu.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menuitem));
//        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menuitem.click();
//
//        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.txtFee));
//        fe_dialogBox_retainerOrShortlist_createJobModalPage.txtFee.sendKeys("5");

        //fe_dialogBox_retainerOrShortlist_createJobModalPage.btnCreateJob.click();
    }

    //###############################################FE: View Dialog Box###############################################################

    @When("I transition offer to placed and view modal")
    public void i_transition_offer_to_placed_and_view_modal() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();


        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_viewDialogBoxPage.btnChangeStage));
        fe_viewDialogBoxPage.btnChangeStage.click();

        wait.until(ExpectedConditions.visibilityOf(fe_viewDialogBoxPage.lnkPlaced));
        fe_viewDialogBoxPage.lnkPlaced.click();

        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //##############################################CHANGE - Job Record - Disable Editing Org##################################

    @When("I change Job Record Disable Editing Org")
    public void i_change_job_record_disable_editing_org() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.linkMyJobs));
        glob_hudPage.linkMyJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.lnkInformationTab));
        change_jobRecord_disableEditingOrgPage.lnkInformationTab.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.btnKeyDetailsEdit));
        change_jobRecord_disableEditingOrgPage.btnKeyDetailsEdit.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.btnCancel));
        change_jobRecord_disableEditingOrgPage.btnCancel.click();


        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.btnKeyDetailsEdit));
        change_jobRecord_disableEditingOrgPage.btnKeyDetailsEdit.click();

        wait.until(ExpectedConditions.elementToBeClickable(change_jobRecord_disableEditingOrgPage.txtWorkingLocationName));
        change_jobRecord_disableEditingOrgPage.txtWorkingLocationName.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.txtWorkingLocationName_item));
        change_jobRecord_disableEditingOrgPage.txtWorkingLocationName_item.click();
//
//        change_jobRecord_disableEditingOrgPage.btnUpdateKeyDetails.click();
    }

    //#############################################CandidateReviewList_DisableReviewButton########################################################

    @When("A Candidate Review List Review Button is Disable")
    public void a_candidate_review_list_review_button_is_disable() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();

    }

    //########################################FE & BE - Alerts - Client Contact - Store & View 'Created By'###########################

    @When("User navigates to Alerts on Client Contact to Store & View {string}")
    public void user_navigates_to_alerts_on_client_contact_to_store_view(String string) {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.btnAddAlert));
        feAndBE_alertsClientContact_storeAndView_createdByPage.btnAddAlert.click();

//        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menu));
//        feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menu.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='alertType']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menuItem));
        feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menuItem.click();


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason));
        feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason.sendKeys("Just an alert");

        //feAndBE_alertsClientContact_storeAndView_createdByPage.btnCreateClientContactAlert.click();

//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
//        glob_hudPage.btnOpenMenu.click();
//
//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.allClientContacts));
//        glob_hudPage.allClientContacts.click();
    }

    //##########################################FE & BE - Alerts - Job - Store & View 'Created By'############################

    @When("User navigates to Alerts on Jobs to Store & View {string}")
    public void user_navigates_to_alerts_on_jobs_to_store_view(String string) {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.lnkJobItem));
        dialogBox_retainerOrShortlist_jobInformationTabPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_job_storeAndView_createdByPage.btnAddAlert));
        feAndBE_alerts_job_storeAndView_createdByPage.btnAddAlert.click();

        //wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.btnAddAlert));
        //feAndBE_alertsClientContact_storeAndView_createdByPage.btnAddAlert.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='alertType']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);



        //wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menu));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(), 'Caution')]"));
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        //feAndBE_alertsClientContact_storeAndView_createdByPage.drpDwnAlertType_menu.click();

        //wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem));
//        feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement elem = driver.findElement(By.xpath("//h6[contains(text(), 'Add Alert')]"));
        exe.executeScript("arguments[0].click();", elem);


        //wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason));
        feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason.sendKeys("Just an alert");


        //feAndBE_alertsClientContact_storeAndView_createdByPage.btnCreateClientContactAlert.click();

    }

    //#######################################FE & BE - Candidate Record - Edit Responsible User##############################

    @When("User Edits Responsible User on Candidate Record")
    public void user_edits_responsible_user_on_candidate_record() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();


        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateRecord_editResponsibleUserPage.lnkInternalTab));
        feAndBE_candidateRecord_editResponsibleUserPage.lnkInternalTab.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateRecord_editResponsibleUserPage.btnEditRecordInfo));
        feAndBE_candidateRecord_editResponsibleUserPage.btnEditRecordInfo.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateRecord_editResponsibleUserPage.txtResponsibleUser));
        feAndBE_candidateRecord_editResponsibleUserPage.txtResponsibleUser.clear();
        feAndBE_candidateRecord_editResponsibleUserPage.txtResponsibleUser.sendKeys("Ajesh");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateRecord_editResponsibleUserPage.txtResponsibleUser_item));
        feAndBE_candidateRecord_editResponsibleUserPage.txtResponsibleUser_item.click();

        change_jobRecord_disableEditingOrgPage.btnUpdateKeyDetails.click();
    }

    //#########################################FE & BE - Candidate Review - Update Review Modal - Add Responsible User & Team####################

    @When("User Candidate Review Update Review Modal and Add Responsible User and Team")
    public void user_candidate_review_update_review_modal_and_add_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        //glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.btnReview));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.btnReview.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleUser_item));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam));
//        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam_item));
//        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam_item.click();

        // change_jobRecord_disableEditingOrgPage.btnUpdateKeyDetails.click();

    }

    //#####################################################FE & BE - Candidate Review List - Display Team Name in header############################################

    @When("User navigates to Candidate Review List and Display Team Name in header")
    public void user_navigates_to_candidate_review_list_and_display_team_name_in_header() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        //glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem.click();

    }

    @Then("I verify if I can view the team name in header")
    public void verify_if_i_can_view_the_team_name_in_header() {
        //wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReviewList_displayTeamNameInHeaderPage.lnkHeader));
        assertThat(feAndBE_candidateReviewList_displayTeamNameInHeaderPage.lnkHeader.getText(), containsString("1 candidate  •   Updated Today  •   Team ScrumbleBees"));
        System.out.println("true");
    }

    //######################################################FE& BE - Job Record - Add/Edit Other Consultants#######################################################

    @When("User Adds or Edits Other Consultants on a Job Record")
    public void user_adds_or_edits_other_consultants_on_a_job_record() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("c9e3d1ff-f084-4a64-8034-24efa638918a");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_jobRecord_addOrEdit_otherConsultantsPage.lnkJobItem));
        feAndBE_jobRecord_addOrEdit_otherConsultantsPage.lnkJobItem.click();

//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        WebElement element = driver.findElement(By.xpath("//p[contains(text(), 'LungaAuto')]"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", element);

        wait.until(ExpectedConditions.visibilityOf(change_jobRecord_disableEditingOrgPage.lnkInformationTab));
        change_jobRecord_disableEditingOrgPage.lnkInformationTab.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnInternalInformationEdit));
        WebElement ele = feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnInternalInformationEdit;
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele);
        //ele.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.sendKeys("Alec Holland");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleUser_item));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleUser_item.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants.sendKeys("Alex Berry");

        wait.until(ExpectedConditions.elementToBeClickable(feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnOtherConsultants_item));
        feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnOtherConsultants_item.click();

        wait.until(ExpectedConditions.visibilityOf(feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants));
        feActivityLogCreateModalAddResponsibleUserOrTeamOrOtherConsultantsPage.btnOtherConsultants.sendKeys("Ajesh Jally");

        wait.until(ExpectedConditions.elementToBeClickable(feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnOtherConsultants_itemTwo));
        feAndBE_jobRecord_addOrEdit_otherConsultantsPage.btnOtherConsultants_itemTwo.click();
    }

    //###########################################User views URL Links To SharePoint - Permanent########################

    @When("User views URL Links To SharePoint Permanent")
    public void user_views_url_links_to_share_point_permanent() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();


        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.txtOutcome));
        feURLLinksToSharePointContractPermanentPage.txtOutcome.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.txtOutcome_item));
        feURLLinksToSharePointContractPermanentPage.txtOutcome_item.click();

        feURLLinksToSharePointContractPermanentPage.btnSave.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.lnkEmailTemplate));
        feURLLinksToSharePointContractPermanentPage.lnkEmailTemplate.click();
    }


    //############################User views URL Links To SharePoint - Contract####################################################


    @When("User views URL Links To SharePoint - Contract")
    public void user_views_url_links_to_share_point_contract() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.linkMyJobs));
        glob_hudPage.linkMyJobs.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPage.lnkJobTwoItem));
        feURLLinksToSharePointContractPage.lnkJobTwoItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.txtOutcome));
        feURLLinksToSharePointContractPermanentPage.txtOutcome.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.txtOutcome_item));
        feURLLinksToSharePointContractPermanentPage.txtOutcome_item.click();

        feURLLinksToSharePointContractPermanentPage.btnSave.click();

        wait.until(ExpectedConditions.visibilityOf(feURLLinksToSharePointContractPermanentPage.lnkEmailTemplate));
        feURLLinksToSharePointContractPermanentPage.lnkEmailTemplate.click();
    }


    //#############################FE & BE - Candidate Review list - display RU in grid instead of Flag consultants########################################

    @When("User Candidate Review list display RU in grid instead of Flag consultants")
    public void user_candidate_review_list_display_ru_in_grid_instead_of_flag_consultants() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        //glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage.getBtnReview));
        feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage.getBtnReview.click();

    }

    //#############################FE & BE - Candidate Review List - Display multiple Candidate Review Lists based on user teams####################

    @When("User displays multiple Candidate Review on User Team")
    public void user_displays_multiple_candidate_review_on_user_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        //glob_hudPage.candidateList.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.lnkCandidateReviewListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage.getBtnReview));
        feAndBE_candidateReviewList_displayRUInGridInsteadOfFlagConsultantsPage.getBtnReview.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam.click();

//        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam_item));
//        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam_item.click();
    }

    //########################################################FE: Placed Transition Modal + Edit Modal - CC, RU & RT Field#######################################################################


    @When("I transition placed modal and edit fields cc and ru and rt")
    public void i_transition_placed_modal_and_edit_fields_cc_and_ru_and_rt() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();


        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.txtResponsibleUser_item.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam));
        feAndBE_candidateReview_updateReviewModal_addResponsibleUserAndTeamPage.txtResponsibleTeam.click();

        wait.until(ExpectedConditions.visibilityOf(fe_placedTransitionModal_editModal_cc_ru_rt_fieldPage.txtResponsibleTeam_item));
        fe_placedTransitionModal_editModal_cc_ru_rt_fieldPage.txtResponsibleTeam_item.click();

        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //#################################################Candidate: Not able to add a 'required' qualification only###############################################

    @When("A candidate user is not able to add a required qualification only")
    public void a_candidate_user_is_not_able_to_add_a_required_qualification_only() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();

//        wait.until(ExpectedConditions.visibilityOf(candidateReviewList_disableReviewButtonPage.btnExpandPage));
//        candidateReviewList_disableReviewButtonPage.btnExpandPage.click();

        wait.until(ExpectedConditions.visibilityOf(candidateNotAbleToAddARequiredQualificationOnlyPage.btnQualificationPlus));
        candidateNotAbleToAddARequiredQualificationOnlyPage.btnQualificationPlus.click();

        wait.until(ExpectedConditions.visibilityOf(candidateNotAbleToAddARequiredQualificationOnlyPage.txtQualificationName));
        candidateNotAbleToAddARequiredQualificationOnlyPage.txtQualificationName.sendKeys("Masters degree");

        //candidateNotAbleToAddARequiredQualificationOnlyPage.btnCreateQualification.click();
    }

    //#################################Create Placed Transition Modal + View on AL##############################################################

    @When("A user creates Placed Transition Modal and View on AL")
    public void a_user_creates_placed_transition_modal_and_view_on_al() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.linkMyJobs));
        glob_hudPage.linkMyJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(createPlacedTransitionModal_viewOnALPage.btnChangeStage));
        createPlacedTransitionModal_viewOnALPage.btnChangeStage.click();

        wait.until(ExpectedConditions.visibilityOf(createPlacedTransitionModal_viewOnALPage.lnkOffer));
        createPlacedTransitionModal_viewOnALPage.lnkOffer.click();

        createPlacedTransitionModal_viewOnALPage.btnSaveToPlaced.click();

//        wait.until(ExpectedConditions.visibilityOf(createPlacedTransitionModal_viewOnALPage.btnDone));
//        createPlacedTransitionModal_viewOnALPage.btnDone.click();

//        wait.until(ExpectedConditions.visibilityOf(createPlacedTransitionModal_viewOnALPage.lnkPlaced));
//        createPlacedTransitionModal_viewOnALPage.lnkPlaced.click();
//
//        wait.until(ExpectedConditions.visibilityOf(createPlacedTransitionModal_viewOnALPage.lnkCandidateRecord));
//        createPlacedTransitionModal_viewOnALPage.lnkCandidateRecord.click();
    }

    //############################################Create: Job Location Remit#######################################################

    @When("User create: Job Location Remit")
    public void user_create_job_location_remit() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateJob));
        glob_hudPage.universalPlusIcon_CreateJob.click();

        //** * Create Job

        wait.until(ExpectedConditions.visibilityOf(create_jobLocationRemitPage.jobTitleTextField));
        create_jobLocationRemitPage.jobTitleTextField.sendKeys("LungaNewJob");

        wait.until(ExpectedConditions.visibilityOf(create_jobLocationRemitPage.organisationTextField));
        create_jobLocationRemitPage.organisationTextField.sendKeys("deu");

        wait.until(ExpectedConditions.visibilityOf(create_jobLocationRemitPage.organisationTextField_item));
        create_jobLocationRemitPage.organisationTextField_item.click();

        wait.until(ExpectedConditions.elementToBeClickable(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu.click();

        wait.until(ExpectedConditions.visibilityOf(create_jobLocationRemitPage.txtLocation_menuitem));
        create_jobLocationRemitPage.txtLocation_menuitem.click();
    }

    //####################################Candidate Personal Tab Delete  and Edit Contact Details Error###################################

    @When("User navigates to Candidate Personal Tab Delete and Edit Contact Details Error")
    public void user_navigates_to_candidate_personal_tab_delete_and_edit_contact_details_error() {

        wait.until(ExpectedConditions.visibilityOf(feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage.lnkCandidate_item));
        feAndBECandidateStatusNotUpdatingOrSettingToCorrectDefaultValuePage.lnkCandidate_item.click();

        wait.until(ExpectedConditions.visibilityOf(candidateReviewList_disableReviewButtonPage.btnExpandPage));
        candidateReviewList_disableReviewButtonPage.btnExpandPage.click();

        wait.until(ExpectedConditions.visibilityOf(candidatePersonalTabDeleteAndEditContactDetailsErrorPage.lnkPersonalTab));
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage.lnkPersonalTab.click();

        //wait.until(ExpectedConditions.elementToBeClickable(candidatePersonalTabDeleteAndEditContactDetailsErrorPage.contactDetailsTextField));
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage.contactDetailsTextField.click();
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage.contactDetailsTextField.click();
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage.contactDetailsTextField.clear();
        candidatePersonalTabDeleteAndEditContactDetailsErrorPage.contactDetailsTextField.sendKeys("luone@email.com");
    }

    //########################################Fe Or Be: Candidate Review - Add Responsible User & Team to view form#####################################

    @When("A user navigates to Candidate Review and Add Responsible User and Team to view form")
    public void a_user_navigates_to_candidate_review_and_add_responsible_user_and_team_to_view_form() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.btnCandidateReview));
        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.btnCandidateReview.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleUser));
        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleUser.click();
        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.sendKeys("Alec Holland");

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item));
//        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtNotes));
        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtNotes.sendKeys("Just a test");

        //feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.btnCreateCandidateReview.click();

    }

    //#################################FE/BE Job Record - Edit Responsible User##############################################################

    @When("User navigates to Job Record and edits Responsible User")
    public void user_navigates_to_job_record_and_edits_responsible_user() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(feOrBEJobRecord_editResponsibleUserPage.btnInformationTab));
        feOrBEJobRecord_editResponsibleUserPage.btnInformationTab.click();

//        wait.until(ExpectedConditions.visibilityOf(feOrBEJobRecord_editResponsibleUserPage.btnInternalInformation));
//        feOrBEJobRecord_editResponsibleUserPage.btnInternalInformation.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//button[@data-testid='internal_information_edit_button']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);



        //##################################################################

//        Thread.sleep(60000);
//        WebElement element = wait.until(ExpectedConditions.visibilityOf(feOrBEJobRecord_editResponsibleUserPage.btnInternalInformation));
//        element.click();

        //#####################################################################

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();
    }

//############################################FE/BE:  Alerts - Candidate - View "Created By"######################################################

    @When("User navigates to Candidates Add an alert and view Created By")
    public void user_navigates_to_candidates_add_an_alert_and_view_created_by() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();


        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBE_alerts_candidate_view_createdByPage.btnAddAlert));
        feOrBE_alerts_candidate_view_createdByPage.btnAddAlert.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBE_alerts_candidate_view_createdByPage.btnAlertType));
        feOrBE_alerts_candidate_view_createdByPage.btnAlertType.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem));
        feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason));
        feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason.sendKeys("Just an alert");

        feOrBE_alerts_candidate_view_createdByPage.btnCreateCandidateAlert.click();

//        wait.until(ExpectedConditions.visibilityOf(feOrBE_alerts_candidate_view_createdByPage.btnAlert));
//        feOrBE_alerts_candidate_view_createdByPage.btnAlert.click();

    }

    @Then("Verify I can view the created by")
    public void verify_i_can_view_the_created_by() {
        wait.until(ExpectedConditions.visibilityOf(feOrBE_alerts_candidate_view_createdByPage.txtVerification));
        assertThat(feOrBE_alerts_candidate_view_createdByPage.txtVerification.getText(), containsString("J'onn J'onzz - 4 July 2021"));
        System.out.println("true");
    }

    //###############################################FE - Pipeline - Transition to Longlist - Add Responsible User & Team############################################

    @When("I transition Transition to Longlist Shortlist Add Responsible User & Team")
    public void i_transition_transition_to_longlist_shortlist_add_responsible_user_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();
//
//        wait.until(ExpectedConditions.visibilityOf(.txtResponsibleTeam_item));
//        .txtResponsibleTeam_item.click();

    }

    //##################################FE - Pipeline - Transition to Shortlist - Add Responsible User & Team########################################

    @When("I transition Transition to Shortlist Add Responsible User & Team")
    public void i_transition_transition_to_shortlist_add_responsible_user_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkShortList));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkShortList.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item));
//        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item.click();
    }

    //##################################FE/BE Candidate - Create Candidate Modal - Add & View Responsible User & Team#######################################

    @When("A user create Candidate create Candidate Modal add and View Responsible User and Team")
    public void a_user_create_candidate_create_candidate_modal_add_and_view_responsible_user_and_team() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateCandidate));
        glob_hudPage.universalPlusIcon_CreateCandidate.click();
        /* Set Personal Details */
        feOrBE_candidate_createCandidateModal_addAndViewResponsibleUserAndTeamPage.firstNameText.sendKeys("LungaOne");
        feOrBE_candidate_createCandidateModal_addAndViewResponsibleUserAndTeamPage.familyNameText.sendKeys("LungaOne");
        create_newCandidatePage.ciyTextfield.sendKeys("Port Elizabeth ");

        /* Responsible User*/
        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

        /* Set Contact Details */
        create_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(create_newCandidatePage.contact_MobileNumber));
        create_newCandidatePage.contact_MobileNumber.click();
        Date date  = new Date();
        actions.sendKeys("045663339" + Keys.ENTER).perform();
        create_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(create_newCandidatePage.contact_EmailAddress));
        create_newCandidatePage.contact_EmailAddress.click();
        actions.sendKeys("free@test.com" + Keys.ENTER).perform();
        /* Set Current Role Details */
        /* Set Looking for Details */
        /* Set Candidate Registration Details */
        /* Set Interview Notes */

        // Submit
        //create_newCandidatePage.createButton.click();
    }

    //######################################Placed Edit Activity Log - Not updating Salary #############################################################

    @When("I transition to Placed and edit activity log not updating Salary")
    public void i_transition_to_placed_and_edit_activity_log_not_updating_salary() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();


        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(placedEditActivityLog_notUpdatingSalaryPage.txtSalaryField));
        placedEditActivityLog_notUpdatingSalaryPage.txtSalaryField.clear();
        placedEditActivityLog_notUpdatingSalaryPage.txtSalaryField.sendKeys("300000");

        placedEditActivityLog_notUpdatingSalaryPage.btnSaveActivity.click();
    }

    //#############################################FE: Dialog Box (Retainer/Shortlist) - Create Job Modal###########################################

    @When("User creates Job Modal and selects agreement type as retainer or shortlist")
    public void user_creates_job_modal_and_selects_agreement_type_as_retainer_or_shortlist() throws Exception{

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateJob));
        glob_hudPage.universalPlusIcon_CreateJob.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName.sendKeys("LuJobTwo");

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_menu.sendKeys("Lung");

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_item));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtOrganisation_item.click();

        wait.until(ExpectedConditions.elementToBeClickable(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtLocation_menu.click();

        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.txtLocation_menuitem));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.txtLocation_menuitem.click();

        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu.click();

        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menu.click();

        wait.until(ExpectedConditions.elementToBeClickable(fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menuitem));
        //Thread.sleep(3000);
        fe_dialogBox_retainerOrShortlist_createJobModalPage.jobStatus_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.aggreementType_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.aggreementType_menu.click();

        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.aggreementType_menuitem));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.aggreementType_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menu.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menuitem));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.exclusivityType_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menu_lookup));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menu_lookup.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menuitem));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.source_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menu));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menu.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menuitem));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.jobType_menuitem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_dialogBox_retainerOrShortlist_createJobModalPage.txtFee));
        fe_dialogBox_retainerOrShortlist_createJobModalPage.txtFee.sendKeys("5");

        //fe_dialogBox_retainerOrShortlist_createJobModalPage.btnCreateJob.click();
    }

    //############################################CHANGE - Job Location Remit - Pop Up Modal##########################################

    @When("User navigates to a Job and changes location remit")
    public void user_navigates_to_a_job_and_changes_location_remit() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.lnkInformationTab));
        change_jobLocationRemit_popUpModalPage.lnkInformationTab.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.btnEditKeyDetails));
        change_jobLocationRemit_popUpModalPage.btnEditKeyDetails.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.txtJobTitleField));
        change_jobLocationRemit_popUpModalPage.txtJobTitleField.sendKeys("Lunga");

//        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.txtWorkingLocationField));
//        change_jobLocationRemit_popUpModalPage.txtWorkingLocationField.click();
//
//        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.txtWorkingLocationField_item));
//        change_jobLocationRemit_popUpModalPage.txtWorkingLocationField_item.click();

        change_jobLocationRemit_popUpModalPage.btnCancel.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.btnOkay));
        change_jobLocationRemit_popUpModalPage.btnOkay.click();

        wait.until(ExpectedConditions.visibilityOf(change_jobLocationRemit_popUpModalPage.btnEditKeyDetails));
        change_jobLocationRemit_popUpModalPage.btnEditKeyDetails.click();
    }

    //##################################################FE - Candidate List Library - Display 1 Name column######################################


    @Then("User verifies if candidate Name column displays one name")
    public void user_verifies_if_candidate_name_column_displays_one_name() {
        wait.until(ExpectedConditions.visibilityOf(fe_candidateListLibrary_displayOneNameColumnPage.txtHeaderName));
        assertThat(fe_candidateListLibrary_displayOneNameColumnPage.txtHeaderName.getText(), containsString("Name"));
        System.out.println("true");
    }

    //##########################################FE - All records - Search for a record by Unique ID#############################################

    @When("User searches for a record by Unique ID")
    public void user_searches_for_a_record_by_unique_id() {

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch));
        fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField));
        fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField.sendKeys("c9d6ef41-e161-4c06-a015-9d74f0bca519");

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnScrollableClientContacts));
        fe_allRecords_searchForARecordByUniqueIDPage.btnScrollableClientContacts.click();
    }

    //######################################FE - Organisation - Search for an Organisation record by name#######################################

    @When("User searches for an Organisation record by name")
    public void user_searches_for_an_organisation_record_by_name() {

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch));
        fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField));
        fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(fe_organisation_searchForAnOrganisationRecordByNamePage.btnScrollableOrganisation));
        fe_organisation_searchForAnOrganisationRecordByNamePage.btnScrollableOrganisation.click();

//        wait.until(ExpectedConditions.visibilityOf(fe_organisation_searchForAnOrganisationRecordByNamePage.lnkOrganisationRecord));
//        fe_organisation_searchForAnOrganisationRecordByNamePage.lnkOrganisationRecord.click();

        WebDriverWait waiting = new WebDriverWait(driver, 15, 100);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'United Kingdom • Live Jobs: 3')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


    }

    //######################################FE - Candidate - Search for a candidate by email address#########################################
    //fe_candidate_searchForACandidateByEmailAddressPage
    @When("User searches for a candidate by an email address")
    public void user_searches_for_a_candidate_by_an_email_address() {

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch));
        fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField));
        fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField.sendKeys("lunga@email.com");
    }

    //#####################################FE - Search Results Page - Header + placeholder page#####################################

    @When("User searches the result page for header plus placeholder")
    public void user_searches_the_result_page_for_header_plus_placeholder() {

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch));
        fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField));
        fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField.sendKeys("A");
    }

    //#####################################FE - Job - Search for a job by organisation name################################################

    @When("User searches for a Job by organisation Name")
    public void user_searches_for_a_job_by_organisation_name() {

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch));
        fe_allRecords_searchForARecordByUniqueIDPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField));
        fe_allRecords_searchForARecordByUniqueIDPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(fe_job_searchForAJobByOrganisationNamePage.btnScrollableJobTab));
        fe_job_searchForAJobByOrganisationNamePage.btnScrollableJobTab.click();
    }

    //#####################################FE - Lists - Add & view records on a Team List#################################################

    @When("User navigates to a record and adds and views the record on a team list")
    public void user_navigates_to_a_record_and_adds_and_views_the_record_on_a_team_list() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();


        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnAddToList));
        glob_hudPage.btnAddToList.click();

        wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.btnListItem));
        fe_lists_addAndViewRecordsOnATeamListPage.btnListItem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.btnAdd));
        fe_lists_addAndViewRecordsOnATeamListPage.btnAdd.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        glob_hudPage.candidateList.click();

        wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.lnkContactList_item));
        fe_lists_addAndViewRecordsOnATeamListPage.lnkContactList_item.click();
    }

    //#########################FE - Integration - Search for job using ID and view real data in search bar####################################

    @When("User searches for job record using ID and view real data in search bar")
    public void user_searches_for_job_record_using_id_and_view_real_data_in_search_bar() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("4ca9e693-8e08-416d-ad42-65ac3b5d77f7");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();
    }

    //################################################FE - Team Lists - Add Responsible Team to Quick Create New List form##############################

    @When("User Adds Responsible Team to Quick Create New List form using Candidate")
    public void user_adds_responsible_team_to_quick_create_new_list_form_using_candidate() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateList));
        glob_hudPage.universalPlusIcon_CreateList.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.btnCandidate));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.btnCandidate.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField.sendKeys("LuList");

//        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
//        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();
//
//        wait.until(ExpectedConditions.visibilityOf(feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item));
//        feOrBe_candidateReview_add_responsibleUser_and_teamToTeviewFormPage.txtResponsibleTeam_item.click();

        //fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.btnCreateCandidateList.click();
    }

    //#################################FE - Team Lists - Add Responsible Team to Quick Create New List form - Client Contact####################################

    @When("User Adds Responsible Team to Quick Create New List form using Client Contact")
    public void user_adds_responsible_team_to_quick_create_new_list_form_using_client_contact() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateList));
        glob_hudPage.universalPlusIcon_CreateList.click();

        wait.until(ExpectedConditions.visibilityOf(feTeamListsAddResponsibleTeamToQuickCreateNewListFormClientContactPage.btnClientContact));
        feTeamListsAddResponsibleTeamToQuickCreateNewListFormClientContactPage.btnClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField.sendKeys("LuList");

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.txtResponsibleTeam_item));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.txtResponsibleTeam_item.click();

        //feTeamListsAddResponsibleTeamToQuickCreateNewListFormClientContactPage.btnCreateClientContactList.click();
    }

    //##############################################FE - Team Lists - Add Responsible Team to Quick Create New List form - Organisation#########################################

    @When("User Adds Responsible Team to Quick Create New List form using Organisation")
    public void user_adds_responsible_team_to_quick_create_new_list_form_using_organisation() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateList));
        glob_hudPage.universalPlusIcon_CreateList.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.btnOrganisation));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.btnOrganisation.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListFormPage.txtListNameField.sendKeys("Chilli");

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleTeam.click();

        wait.until(ExpectedConditions.visibilityOf(fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.txtResponsibleTeam_item));
        fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.txtResponsibleTeam_item.click();

        //fe_teamLists_addResponsibleTeamToQuickCreateNewListForm_organisationPage.btnCreateOrganisationList.click();
    }

    //################################FE - "Add to job" - Display only jobs associated with logged in user##############################################

    @When("User adds record to Job and Display only jobs associated with logged in user")
    public void user_adds_record_to_job_and_display_only_jobs_associated_with_logged_in_user() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();


        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage.btnAddToJob));
        fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage.btnAddToJob.click();

//        wait.until(ExpectedConditions.visibilityOf(fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage.rdBtnJob_item));
//        fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage.rdBtnJob_item.click();
//
//        fe_addToJob_displayOnlyJobsAssociatedWithLoggedInUserPage.getBtnAddToJob.click();
    }

    //##################################FE - Candidate Review List - Displaying "undefined" in header for 0 candidates in list#########################################

    @When("User navigates to a Candidate Review List with Zero candidates there is an undefined message")
    public void user_navigates_to_a_candidate_review_list_with_zero_candidates_there_is_an_undefined_message() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
//        glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(fe_candidateReviewListDisplaying_undefined_inHeaderForZeroCandidatesInListPage.lnkCandidateReviewList_item));
        fe_candidateReviewListDisplaying_undefined_inHeaderForZeroCandidatesInListPage.lnkCandidateReviewList_item.click();
    }

    //########################FE/BE - Pipeline - Transition to Send CV - Add Responsible User & Team###################################################################

    @When("User transitions to Send CV and adds Responsible User and Teams")
    public void user_transitions_to_send_cv_and_adds_responsible_user_and_teams() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkCVSent));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_sendCVPage.lnkCVSent.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.txtResponsibleUser_item.click();

        //beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnSave.click();
    }

    //###############################################BE - Alerts - Candidate - Add & View on record###############################################

    @When("User navigates to a Candidate and adds an alert and Views a record")
    public void user_navigates_to_a_candidate_and_adds_an_alert_and_views_a_record() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(be_alerts_candidate_addAndViewOnRecordPage.lnkCandidateItem));
        be_alerts_candidate_addAndViewOnRecordPage.lnkCandidateItem.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBE_alerts_candidate_view_createdByPage.btnAddAlert));
        feOrBE_alerts_candidate_view_createdByPage.btnAddAlert.click();

        //wait.until(ExpectedConditions.visibilityOf(be_alerts_candidate_addAndViewOnRecordPage.btnAlertType));
        //be_alerts_candidate_addAndViewOnRecordPage.btnAlertType.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='alertType']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


//        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem));
//        feAndBE_alerts_job_storeAndView_createdByPage.drpDwnJobAlertType_menuItem.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(), 'Caution')]"));
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].click();", ele);


        wait.until(ExpectedConditions.visibilityOf(be_alerts_candidate_addAndViewOnRecordPage.txtReason));
        be_alerts_candidate_addAndViewOnRecordPage.txtReason.sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit risus. Phasellus nec sem in justo pellentesque facilisis. Etiam imperdiet imperdiet orci. Nunc nec neque. Phasellus leo dolor, tempus non, auctor et, hendrerit quis, nisi. Curabitur ligula sapien, tincidunt non, euismod vitae, posuere imperdiet, leo. Maecenas malesuada. Praesent congue erat at massa. Sed cursus turpis vitae tortor. Donec posuere vulputate arcu. Phasellus accumsan cursus velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed aliquam, nisi quis porttitor congue, elit erat euismod orci, ac placerat dolor lectus quis orci. Phasellus consectetuer vestibulum elit. Aenean tellus metus, bibendum sed, posuere ac, mattis non, nunc. Vestibulum fringilla pede sit amet augue. In turpis. Pellentesque posuere. Praesent turpis. Aenean posuere, tortor sed cursus feugiat, nunc augue blandit nunc, eu sollicitudin urna dolor sagittis lacus. Donec el");

        //feOrBE_alerts_candidate_view_createdByPage.btnCreateCandidateAlert.click();
    }

    //##############################################FE & BE - Alerts - Candidate - View Candidate alerts in Lists/library######################################################

    @When("User navigates to a Candidate List record and views an alert")
    public void user_navigates_to_a_candidate_list_record_and_views_an_alert() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        glob_hudPage.candidateList.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert.click();
    }

    //#######################################################Alerts - Candidate - Archive Alert###########################################

    @When("User navigates to a Candidate alert and delete and alert")
    public void user_navigates_to_a_candidate_alert_and_delete_and_alert() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
        //glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert.click();

        wait.until(ExpectedConditions.visibilityOf(alerts_candidate_archiveAlertPage.btnDelete));
        alerts_candidate_archiveAlertPage.btnDelete.click();
    }

    //###############################################Alerts - Candidate - Edit existing alert#####################################################

    @When("User Edits an existing alert")
    public void user_edits_an_existing_alert() {

        driver.manage().window().maximize();


        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        //wait.until(ExpectedConditions.invisibilityOf(glob_hudPage.candidateList));
        wait.until(ExpectedConditions.elementToBeClickable(glob_hudPage.candidateList));
        //glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason));
        feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason.clear();
        feAndBE_alertsClientContact_storeAndView_createdByPage.txtReason.sendKeys("Lorem New alert");

        alerts_candidate_editExistingAlertPage.btnSave.click();
    }

    //#########################################FE/BE - Pipeline Mgmt Offer not storing CC ID#################################################################

    @When("User checks Pipeline Mgmt Offer not storing CC ID")
    public void user_checks_pipeline_mgmt_offer_not_storing_cc_id() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("c9e3d1ff-f084-4a64-8034-24efa638918a");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_offerPage.lnkOffer));
        feOrBE_pipelineMgmtOfferNotStoringCI_idPage.lnkOffer.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();
    }

    //#########################################FE/BE - Pipeline Mgmt Placed not storing CC ID#################################################################

    @When("User checks Pipeline Mgmt Placed not storing CC ID")
    public void user_checks_pipeline_mgmt_placed_not_storing_cc_id() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("c9e3d1ff-f084-4a64-8034-24efa638918a");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_placedPage.lnkPlaced.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.jobCheckboxItem.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.btnEditActivity.click();
    }

    //######################################################Dialog Box - Retainer/Shortlist - Job Information Tab#####################################

    @When("User changes agreement Type to Retainer or Shortlist")
    public void user_changes_agreement_type_to_retainer_or_shortlist() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.lnkJobItem));
        dialogBox_retainerOrShortlist_jobInformationTabPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.lnkInformationTab));
        dialogBox_retainerOrShortlist_jobInformationTabPage.lnkInformationTab.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.txtAgreementType));
        dialogBox_retainerOrShortlist_jobInformationTabPage.txtAgreementType.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.lnkAgreementType_item));
        dialogBox_retainerOrShortlist_jobInformationTabPage.lnkAgreementType_item.click();
    }

    //####################################################Candidate -Error  when Creating an  Alert after clearing  an Expiry Date##############################

    @When("User gets an error after clearing and expiry date on an Alert")
    public void user_gets_an_error_after_clearing_and_expiry_date_on_an_alert() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
//        glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnExpiryDateCalendar));
        candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnExpiryDateCalendar.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnClear));
        candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnClear.click();

//        wait.until(ExpectedConditions.visibilityOf(candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnSave));
//        candidate_errorWhenCreatingAnAlertAfterClearingAnExpiryDatePage.btnSave.click();
    }

    //##########################################Client contact- No validation on position start and end dates#######################################################

    @When("User navigates to Client contact information tab gets no validation on dates")
    public void user_navigates_to_client_contact_information_tab_gets_no_validation_on_dates() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkInformationTab));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkInformationTab.click();
    }

    //#######################################Candidate - Delete Alert Dialogue Box - 'Ok' Button Issue################################################################

    @When("User Deletes Alert Dialogue Box on a Candidate Ok Button Issue")
    public void user_deletes_alert_dialogue_box_on_a_candidate_ok_button_issue() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
//        glob_hudPage.candidateList.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@data-testid='candidatesListsLink']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.lnkCandidateListItem.click();

        wait.until(ExpectedConditions.visibilityOf(feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert));
        feAndBE_alerts_candidate_viewCandidateAlertsInListsOrlibraryPage.imgAlert.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete));
        candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete.click();
    }

    //##############################################Client Contact - Delete Alert Dialogue Box - 'Ok' Button Issue

    @When("User Deletes Alert Dialogue Box on a Client Contact Ok Button Issue")
    public void user_deletes_alert_dialogue_box_on_a_client_contact_ok_button_issue() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact));
        clientContact_noValidationOnPositionStartAndEndDatesPage.lnkClientContact.click();

        wait.until(ExpectedConditions.visibilityOf(clientContact_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert));
        clientContact_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete));
        candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete.click();
    }

    //###########################################################Job - Delete Alert Dialogue Box - 'Ok' Button Issue###########################################################

    @When("User Deletes Alert Dialogue Box on a Job Ok Button Issue")
    public void user_deletes_alert_dialogue_box_on_a_job_ok_button_issue() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(job_deleteAlertDialogueBox_ok_buttonIssuePage.lnkJobItem));
        job_deleteAlertDialogueBox_ok_buttonIssuePage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(job_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert));
        job_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete));
        candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete.click();
    }

    //######################################################Organisation - Delete Alert Dialogue Box - 'Ok' Button Issue##############################################

    @When("User Deletes Alert Dialogue Box on a Organisation Ok Button Issue")
    public void user_deletes_alert_dialogue_box_on_a_organisation_ok_button_issue() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableOrganisation));
        glob_hudPage.btnScrollableOrganisation.click();

        wait.until(ExpectedConditions.visibilityOf(organisation_deleteAlertDialogueBox_ok_buttonIssuePage.lnkOrganisationItem));
        organisation_deleteAlertDialogueBox_ok_buttonIssuePage.lnkOrganisationItem.click();

        wait.until(ExpectedConditions.visibilityOf(job_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert));
        job_deleteAlertDialogueBox_ok_buttonIssuePage.btnAlert.click();

        wait.until(ExpectedConditions.visibilityOf(candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete));
        candidate_deleteAlertDialogueBox_ok_buttonIssuePage.btnDelete.click();
    }

    //########################################################Job - Header - Salary######################################################

    @When("A job salary displays on a job header")
    public void a_job_salary_displays_on_a_job_header() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(dialogBox_retainerOrShortlist_jobInformationTabPage.lnkInformationTab));
        dialogBox_retainerOrShortlist_jobInformationTabPage.lnkInformationTab.click();
    }

    //##########################################FE - Page not found on header queries############################################################

    @When("User navigates to open jobs")
    public void user_navigates_to_open_jobs() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.linkMyJobs));
        glob_hudPage.linkMyJobs.click();
    }

    //#######################################FE - All records - Search for a record by Unique ID - Candidates#####################################

    @When("User searches for a Candidate record by Unique ID")
    public void user_searches_for_a_candidate_record_by_unique_id() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("0c02be84-98e1-44c0-a760-6f1a963992d1");
    }
    //##########################################FE - All records - Search for a record by Unique ID - Job###########################################

    @When("User searches for a Job record by Unique ID")
    public void user_searches_for_a_job_record_by_unique_id() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("4ca9e693-8e08-416d-ad42-65ac3b5d77f7");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();
    }

    //########################################FE - All records - Search for a record by Unique ID - Organisation##########################################

    @When("User searches for a Organisation record by Unique ID")
    public void user_searches_for_a_organisation_record_by_unique_id() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("15f0e681-eda5-4561-b559-118eb97647d1");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableOrganisation));
        glob_hudPage.btnScrollableOrganisation.click();
    }

    //#########################################FE - Search bar field + container############################################################
    //
    @When("User tests the search bar field and container")
    public void user_tests_the_search_bar_field_and_container() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("eitr");
    }

    //#######################################################FE - Search bar field + container##############################################

    @When("User adds and views records on List")
    public void user_adds_and_views_records_on_list() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(be_alerts_candidate_addAndViewOnRecordPage.lnkCandidateItem));
        be_alerts_candidate_addAndViewOnRecordPage.lnkCandidateItem.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnTopPlus));
        glob_hudPage.btnTopPlus.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnAddToList));
        glob_hudPage.btnAddToList.click();

         //wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.btnListItem));
//        fe_lists_addAndViewRecordsOnATeamListPage.btnListItem.click();



        //wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.btnAdd));
        //fe_lists_addAndViewRecordsOnATeamListPage.btnAdd.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//button[@data-testid='testIdSubmit']"));
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].click();", ele);

//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
//        glob_hudPage.btnOpenMenu.click();
//
//        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.candidateList));
//        glob_hudPage.candidateList.click();
//
//        wait.until(ExpectedConditions.visibilityOf(fe_lists_addAndViewRecordsOnATeamListPage.lnkContactList_item));
//        fe_lists_addAndViewRecordsOnATeamListPage.lnkContactList_item.click();
    }

    //#########################################################FE - Search bar tabs ###########################################

    @When("User Searches on bar tabs")
    public void user_searches_on_bar_tabs() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("eitr");
    }

    //#####################################Error upon Job Creation on mandatory fields###################################################

    @When("User gets an Error upon Job Creation on mandatory fields")
    public void user_gets_an_error_upon_job_creation_on_mandatory_fields() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateJob));
        glob_hudPage.universalPlusIcon_CreateJob.click();

        wait.until(ExpectedConditions.visibilityOf(feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName));
        feOrBe_lJob_createJobModal_addAndViewResponsibleUser_teamPage.txtJobTitleName.sendKeys("L");
    }

    //##############################################FE - Client Contact - Jobs tab error################################################

    @When("User navigates to Client Contact and gets an error on Jobs tab")
    public void user_navigates_to_client_contact_and_gets_an_error_on_jobs_tab() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenMenu));
        glob_hudPage.btnOpenMenu.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.clientList));
        glob_hudPage.clientList.click();

        wait.until(ExpectedConditions.visibilityOf(fe_clientContact_jobsTabErrorPage.lnkClientListItem));
        fe_clientContact_jobsTabErrorPage.lnkClientListItem.click();
    }

    //##############################################FE: Job Record - Status Dropdown###########################################################

    @When("User navigates to a Job Record and click on Status Dropdown")
    public void user_navigates_to_a_job_record_and_click_on_status_dropdown() {
        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem));
        beAndFE_pipeline_editModals_addResponsibleUserAndTeam_shortListPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_jobRecord_statusDropdownPage.btnStatusDropdown));
        fe_jobRecord_statusDropdownPage.btnStatusDropdown.click();

    }

    //#######################################FE - Candidate - Search for a Candidate record by name############################

    @When("User searches for a Candidate Record by name")
    public void user_searches_for_a_candidate_record_by_name() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");
    }

    //##############################FE - Client Contact - Search for a client contact record by email address###################################

    @When("User Searches for a client contact record by email address")
    public void user_searches_for_a_client_contact_record_by_email_address() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lungaclient@email.com");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();
    }

    //##############################################FE - Job - Search for a job by job title################################################

    @When("User Searches for a job by job title")
    public void user_searches_for_a_job_by_job_title() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("LungaAuto");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();
    }

    //###########################################FE  - Client Contact - Search for a client contact by name###################################

    @When("User Searches for a client contact by name")
    public void user_searches_for_a_client_contact_by_name() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();
    }

    //###############################################FE - Search Results Page - View all candidate results in list view##############################

    @When("User Searches for Results Page and View all candidate results in list view")
    public void user_searches_for_results_page_and_view_all_candidate_results_in_list_view() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem));
        feAndBE_candidate_status_not_updating_or_setting_to_correct_default_valuePage.lnkCandidateItem.click();
    }

    //######################################FE - Job - Search for a job by main client contact name##########################################################

    @When("User Searches for a job by main client contact name")
    public void user_searches_for_a_job_by_main_client_contact_name() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();
    }

    //###########################FE - Search Results Page - View all client contact results in list view############################################

    @When("User Searches for Results Page and View all client contact results in list view")
    public void user_searches_for_results_page_and_view_all_client_contact_results_in_list_view() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableClientContacts));
        glob_hudPage.btnScrollableClientContacts.click();

        wait.until(ExpectedConditions.visibilityOf(fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults));
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults.click();
    }

    //###########################FE - Search Results Page - View all organisation results in list view###################################

    @When("User Searches for Results Page and View all organisation results in list view")
    public void user_searches_for_results_page_and_view_all_organisation_results_in_list_view() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableOrganisation));
        glob_hudPage.btnScrollableOrganisation.click();

        wait.until(ExpectedConditions.visibilityOf(fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults));
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults.click();
    }

    //##########################################FE - Search Results Page - View all job results in list view##################################

    @When("User Searches for Results Page and View all job results in list view")
    public void user_searches_for_results_page_and_view_all_job_results_in_list_view() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults));
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults.click();
    }

    //########################################FE - Implement standard & validation on phone number input#############################################

    //fe_implementStandardAndValidationOnPhoneNumberInputPage
    @When("User Implements standard and validation on phone number input")
    public void user_implements_standard_and_validation_on_phone_number_input() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon));
        glob_hudPage.universalPlusIcon.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.universalPlusIcon_CreateCandidate));
        glob_hudPage.universalPlusIcon_CreateCandidate.click();

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.txtFirstNameField));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.txtFirstNameField.sendKeys("Lutest");

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.txtFamilyNameField));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.txtFamilyNameField.sendKeys("Lutest");

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.btnContactDetailsPlus));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.btnContactDetailsPlus.click();

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.lnkMobileNumber));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.lnkMobileNumber.click();

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.txtMobileNumberField));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.txtMobileNumberField.sendKeys("11111");

        wait.until(ExpectedConditions.visibilityOf(fe_implementStandardAndValidationOnPhoneNumberInputPage.txtJobTitle));
        fe_implementStandardAndValidationOnPhoneNumberInputPage.txtJobTitle.click();
    }

    //##########################FE  - Organisation - Search for an Organisation record by alias##############################################

    @When("User Searches for an Organisation record by alias")
    public void user_searches_for_an_organisation_record_by_alias() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("United Kingdom");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableOrganisation));
        glob_hudPage.btnScrollableOrganisation.click();
    }

    //#####################################Feature: FE: Candidate / CC - Gender Dropdown Values##############################################
    //fe_candidateOrCC_genderDropdownValuesPage
    @When("User views Gender Dropdown Values a Candidate record")
    public void user_views_gender_dropdown_values_a_candidate_record() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(fe_candidateOrCC_genderDropdownValuesPage.lnkCandidateItem));
        fe_candidateOrCC_genderDropdownValuesPage.lnkCandidateItem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_candidateOrCC_genderDropdownValuesPage.lnkPersonalTab));
        fe_candidateOrCC_genderDropdownValuesPage.lnkPersonalTab.click();

        wait.until(ExpectedConditions.visibilityOf(fe_candidateOrCC_genderDropdownValuesPage.btnGender));
        fe_candidateOrCC_genderDropdownValuesPage.btnGender.click();

//        WebElement element = driver.findElement(By.xpath("//label[contains(text(), 'Gender')]"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", element);
    }

    //######################################################FE: My Jobs List - Status Dropdown########################################################
    //fe_myJobsList_statusDropdownPage
    @When("User views Gender Dropdown status on Job List")
    public void user_views_gender_dropdown_status_on_job_list() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(fe_myJobsList_statusDropdownPage.lnkJobItem));
        fe_myJobsList_statusDropdownPage.lnkJobItem.click();

        wait.until(ExpectedConditions.visibilityOf(fe_jobRecord_statusDropdownPage.btnStatusDropdown));
        fe_jobRecord_statusDropdownPage.btnStatusDropdown.click();
    }

    //#############################FE - Search Results Page - Add total number of results per each record type####################

    @When("User Searches Results Page and Add total number of results per each record type")
    public void user_searches_results_page_and_add_total_number_of_results_per_each_record_type() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

        wait.until(ExpectedConditions.visibilityOf(fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults));
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults.click();
    }

    //########################################FE - Candidate search result: Null values displayed################################################

    @When("User searches for a Candidate result Null values displayed")
    public void user_searches_for_a_candidate_result_null_values_displayed() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("l");
    }

    //##############################################FE - Search Results Page - Header + placeholder page########################################

    @When("User Searches for Results Page Header plus placeholder page")
    public void user_searches_for_results_page_header_plus_placeholder_page() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("lunga");

        wait.until(ExpectedConditions.visibilityOf(fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults));
        fe_searchResultsPage_viewAllClientContactResultsInListVewPage.lnkSeeAllResults.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("l");
    }

    //#############################FE - Search - Organisation country should show full country name#############################

    @When("User Search for Organisation country should show full country name")
    public void user_search_for_organisation_country_should_show_full_country_name() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("HSBC");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableOrganisation));
        glob_hudPage.btnScrollableOrganisation.click();
    }

    //###############################FE - Search dropdown - Job search suggestions don't display RU value#######################

    @When("Search dropdown on Job search suggestions don't display RU value")
    public void search_dropdown_on_job_search_suggestions_don_t_display_ru_value() {

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnOpenSearch));
        glob_hudPage.btnOpenSearch.click();

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.txtSearchField));
        glob_hudPage.txtSearchField.sendKeys("Lunga");

        wait.until(ExpectedConditions.visibilityOf(glob_hudPage.btnScrollableJobs));
        glob_hudPage.btnScrollableJobs.click();

    }

}



