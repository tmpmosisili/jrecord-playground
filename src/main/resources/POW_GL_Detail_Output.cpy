       01 GLI-INTERNAL-TRANSACTION.
          05  GLI-DETAIL-AREA.
             10  GLI-CURR-DATA-GROUP                  PIC 9(04) COMP.
             10  GLI-SUBPROD-CODE                     PIC X(02).
             10  GLI-TRANS-POST-DEFINITION.
                15  GLI-PD-TRAN-SIGN                 PIC S9 COMP-3.
                15  GLI-PD-TRAN-TYPE                 PIC X(01).
                15  GLI-PD-PAPER-PAPERLESS           PIC X(01).
                15  GLI-PD-INTERN-GEN                PIC X(01).
                15  GLI-PD-CAPTURE-ACTY              PIC X(02).
                15  GLI-PD-CCP-REJ-CODE              PIC X(02).
                15  GLI-PD-TRANS-PAYCDE-ALERTS       PIC X(01).
                15  GLI-PD-TRANS-PAYCDE-BLOCKS       PIC X(01).
                15  GLI-PD-PROCESS-STOPS             PIC X(01).
                15  GLI-PD-REST-PAYCDE-ALERTS        PIC X(01).
                15  GLI-PD-REST-PAYCDE-BLOCKS        PIC X(01).
                15  GLI-PD-REST-STOP-STATUS          PIC X(01).
                15  GLI-PD-INT-DESC-SET              PIC X(01).
                15  GLI-OVERRIDE-BACKDATE-DAYS       PIC X(01).
                15  GLI-GLI-SOURCE                   PIC X(01).
                15  GLI-DEBIT-CREDIT-NOTICE          PIC X(01).
             10  GLI-TRANSACTION-AREA.
                15  GLI-TRANS-NO                     PIC X(04).
                15  GLI-CO-ID                        PIC 9(04) COMP.
                15  GLI-APPL-ID                      PIC X(02).
                15  GLI-FUNC-ID                      PIC X(02).
                15  GLI-SOURCE-TYPE                  PIC X(02).
                15  GLI-ENVIRONMENT                  PIC X(02).
                15  GLI-TIME                         PIC S9(07) COMP-3.
                15  GLI-SYS-DATE                     PIC S9(07) COMP-3.
                15  GLI-SOURCE                       PIC X(08).
                15  GLI-OPERATOR                     PIC X(20).
                15  GLI-FNB-OPERATOR REDEFINES GLI-OPERATOR.
                    20  GLI-SYSTEM-SOURCE-ID         PIC X(03).
                    20  GLI-SOURCE-DEVICE-TYPE       PIC X(02).
                    20  GLI-REMIT-BRANCH             PIC 9(06).
                    20  FILLER                       PIC X(09).
                15  GLI-POST-DATE                    PIC S9(07) COMP-3.
                15  GLI-ACT-NO                     PIC 9(15) COMP-3.
                15  GLI-TRACE-ID                     PIC X(20).
                15  GLI-OFFICER                      PIC X(05).
                15  GLI-DESCRIPTION                  PIC X(47).
                15  GLI-EFFECTIVE-DATE               PIC S9(07) COMP-3.
                15  GLI-PD-TRAN-CODE-REVERSED        PIC X(02).
                15  GLI-PD-COUNT-STMT-ITEM           PIC X(01).
                15  GLI-PD-STMT-REVERSAL-CODE        PIC X(01).
                15  GLI-PD-DEP-WD                    PIC X(01).
                15  GLI-NO-FOREIGN-DEP-ITEMS         PIC S9(04) COMP.
                15  GLI-STMT-CATG                    PIC S9(03) COMP-3.
                15  GLI-TRANS-AMT                    PIC S9(11)V99 COMP-3.
                15  GLI-CASH-AMT                     PIC S9(11)V99 COMP-3.
                15  GLI-LOC-INT-COLL                 PIC S9(05)V99 COMP-3.
                15  GLI-CK-SERIAL-NO                 PIC S9(10) COMP-3.
                15  GLI-TRANSFER-INFO.
                    20  GLI-APPL-ID-TO               PIC X(02).
                    20  GLI-FUNC-TO                  PIC X(02).
                    20  GLI-ACT-NO-TO                PIC 9(15) COMP-3.
                    20  GLI-APPL-ID-FROM             PIC X(02).
                    20  GLI-FUNC-FROM                PIC X(02).
                    20  GLI-ACT-NO-FROM              PIC 9(15) COMP-3.
                15  GLI-FLOAT-FIELDS.
                    20  GLI-AMT-FLOAT-0              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-1              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-2              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-3              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-4              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-5              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-6              PIC S9(11)V99 COMP-3.
                    20  GLI-AMT-FLOAT-7              PIC S9(11)V99 COMP-3.
                15  GLI-NO-CR                        PIC S9(05) COMP-3.
                15  GLI-NO-LOCAL-DEP-ITEMS           PIC S9(05) COMP-3.
                15  GLI-NO-DR                        PIC S9(05) COMP-3.
                15  GLI-BRANCH                       PIC S9(05) COMP-3.
                15  GLI-TRANS-SEQ                    PIC S9(07) COMP-3.
                15  GLI-PAID-INTO-OD                 PIC X(01).
                15  GLI-OVERRIDE-TERM-CODE           PIC X(01).
                15  GLI-WITHHOLD-MEMO-FLAG           PIC X(01).
             10  GLI-EXTENDED-DETAILS.
                15  GLI-TRACE-ID-CONT               PIC X(10).
                15  GLI-DESCRIPTION-CONT            PIC X(53).
                15  GLI-BRANCH-OF-ORIGIN            PIC S9(05) COMP-3.
                15  GLI-CAPTURE-CENTER              PIC S9(09) COMP-3.
                15  GLI-INPUT-CURRENCY              PIC X(03).
                15  GLI-ORIG-CURRENCY               PIC X(03).
             10 GLI-ORIG-CONTI.
                15  GLI-ORIG-CURR-TRAN-AMT          PIC S9(11)V99  COMP-3.
                15  GLI-EXCHG-RATE                  PIC S9(6)V9(7) COMP-3.
                15  GLI-LOC-INT-COLL                PIC S9(7)V99   COMP-3.
                15  GLI-LOC-INS-COLL                PIC S9(7)V99   COMP-3.
                15  GLI-STMT-ACCT-SEQ               PIC S9(03)     COMP-3.
                15  GLI-ONLINE-FUNC-ID              PIC X(02).
                15  GLI-CUTOFF-STMT-DATE            PIC S9(07) COMP-3.
                15  GLI-OVERRIDE-INT-CODE           PIC X(02).
                15  GLI-OVERRIDE-RATE               PIC S99V9(5) COMP-3.
                15  GLI-OVERRIDE-TERM-AMT           PIC S9(05) COMP-3.
                15  GLI-MEMO-REV-POINTERS.
                    20  GLI-PD-REV-ORIG-SEQ         PIC S9(04) COMP.
                    20  GLI-PD-REV-ORIG-OCCUR       PIC S9(04) COMP.
                15  GLI-INT-PAID-NOT-DISBURSED      PIC S9(9)V99 COMP-3.
                15  GLI-LOC-SV-CHG-COLL             PIC S9(7)V99 COMP-3.
                15  GLI-LOC-LT-CHG-COLL             PIC S9(7)V99 COMP-3.
                15  GLI-LOC-MISC-CHG-COLL           PIC S9(7)V99 COMP-3.
             10  GLI-REMAINDER-FIELDS.
                15  GLI-FEE-REGION                  PIC X(4).
                15  GLI-PAYMENT-TYPE                PIC XX.
                15  GLI-PAYMENT-SEQUENCE-X.
                    20  GLI-PAYMENT-SEQUENCE        PIC S9(18) COMP.
                15  GLI-XFER-PROD-CODE              PIC XXX.
                15  GLI-XFER-ACT-NO                 PIC X(23).
                15  GLI-TXN-REASON-CODE             PIC XXX.
                15  GLI-REVERSAL-TXN-ORIG-SOURCE    PIC X(8).
                15  GLI-DEVICE-ORIGIN-BRANCH        PIC S9(5) COMP-3.
                15  FILLER                         PIC X(399).