Compiled from "Opcode.java"
public final class Opcode extends java.lang.Enum<Opcode> {
  public static final Opcode PLUS;

  public static final Opcode MINUS;

  public static final Opcode MUL;

  public static final Opcode DIV;

  public static final Opcode MOD;

  public static final Opcode AND;

  public static final Opcode OR;

  public static final Opcode L;

  public static final Opcode G;

  public static final Opcode LE;

  public static final Opcode GE;

  public static final Opcode E;

  public static final Opcode NE;

  public static final Opcode NOT;

  public static final Opcode UM;

  public static final Opcode ASSIGN;

  public static final Opcode JZ;

  public static final Opcode JMP;

  public static final Opcode WI;

  public static final Opcode WF;

  public static final Opcode WT;

  public static final Opcode RI;

  public static final Opcode RF;

  public static final Opcode RT;

  public static final Opcode PC;

  public static final Opcode SP;

  public static final Opcode ASP;

  public static final Opcode RET;

  public static final Opcode ISP;

  public static final Opcode DSP;

  public static final Opcode EX;

  public static final Opcode ARB;

  public static final Opcode GMM;

  public static final Opcode FMM;

  public static final Opcode BAND;

  public static final Opcode BOR;

  public static final Opcode BNOT;

  public static final Opcode BXOR;

  public static final Opcode BSHR;

  public static final Opcode BSHL;

  public static final Opcode OVERFLOW;

  public static Opcode[] values();
    Code:
       0: getstatic     #1                  // Field $VALUES:[LOpcode;
       3: invokevirtual #2                  // Method "[LOpcode;".clone:()Ljava/lang/Object;
       6: checkcast     #3                  // class "[LOpcode;"
       9: areturn

  public static Opcode valueOf(java.lang.String);
    Code:
       0: ldc           #4                  // class Opcode
       2: aload_0
       3: invokestatic  #5                  // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #4                  // class Opcode
       9: areturn

  static {};
    Code:
       0: new           #4                  // class Opcode
       3: dup
       4: ldc           #7                  // String PLUS
       6: iconst_0
       7: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #9                  // Field PLUS:LOpcode;
      13: new           #4                  // class Opcode
      16: dup
      17: ldc           #10                 // String MINUS
      19: iconst_1
      20: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #11                 // Field MINUS:LOpcode;
      26: new           #4                  // class Opcode
      29: dup
      30: ldc           #12                 // String MUL
      32: iconst_2
      33: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #13                 // Field MUL:LOpcode;
      39: new           #4                  // class Opcode
      42: dup
      43: ldc           #14                 // String DIV
      45: iconst_3
      46: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #15                 // Field DIV:LOpcode;
      52: new           #4                  // class Opcode
      55: dup
      56: ldc           #16                 // String MOD
      58: iconst_4
      59: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #17                 // Field MOD:LOpcode;
      65: new           #4                  // class Opcode
      68: dup
      69: ldc           #18                 // String AND
      71: iconst_5
      72: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      75: putstatic     #19                 // Field AND:LOpcode;
      78: new           #4                  // class Opcode
      81: dup
      82: ldc           #20                 // String OR
      84: bipush        6
      86: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
      89: putstatic     #21                 // Field OR:LOpcode;
      92: new           #4                  // class Opcode
      95: dup
      96: ldc           #22                 // String L
      98: bipush        7
     100: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     103: putstatic     #23                 // Field L:LOpcode;
     106: new           #4                  // class Opcode
     109: dup
     110: ldc           #24                 // String G
     112: bipush        8
     114: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     117: putstatic     #25                 // Field G:LOpcode;
     120: new           #4                  // class Opcode
     123: dup
     124: ldc           #26                 // String LE
     126: bipush        9
     128: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     131: putstatic     #27                 // Field LE:LOpcode;
     134: new           #4                  // class Opcode
     137: dup
     138: ldc           #28                 // String GE
     140: bipush        10
     142: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     145: putstatic     #29                 // Field GE:LOpcode;
     148: new           #4                  // class Opcode
     151: dup
     152: ldc           #30                 // String E
     154: bipush        11
     156: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     159: putstatic     #31                 // Field E:LOpcode;
     162: new           #4                  // class Opcode
     165: dup
     166: ldc           #32                 // String NE
     168: bipush        12
     170: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     173: putstatic     #33                 // Field NE:LOpcode;
     176: new           #4                  // class Opcode
     179: dup
     180: ldc           #34                 // String NOT
     182: bipush        13
     184: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     187: putstatic     #35                 // Field NOT:LOpcode;
     190: new           #4                  // class Opcode
     193: dup
     194: ldc           #36                 // String UM
     196: bipush        14
     198: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     201: putstatic     #37                 // Field UM:LOpcode;
     204: new           #4                  // class Opcode
     207: dup
     208: ldc           #38                 // String ASSIGN
     210: bipush        15
     212: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     215: putstatic     #39                 // Field ASSIGN:LOpcode;
     218: new           #4                  // class Opcode
     221: dup
     222: ldc           #40                 // String JZ
     224: bipush        16
     226: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     229: putstatic     #41                 // Field JZ:LOpcode;
     232: new           #4                  // class Opcode
     235: dup
     236: ldc           #42                 // String JMP
     238: bipush        17
     240: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     243: putstatic     #43                 // Field JMP:LOpcode;
     246: new           #4                  // class Opcode
     249: dup
     250: ldc           #44                 // String WI
     252: bipush        18
     254: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     257: putstatic     #45                 // Field WI:LOpcode;
     260: new           #4                  // class Opcode
     263: dup
     264: ldc           #46                 // String WF
     266: bipush        19
     268: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     271: putstatic     #47                 // Field WF:LOpcode;
     274: new           #4                  // class Opcode
     277: dup
     278: ldc           #48                 // String WT
     280: bipush        20
     282: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     285: putstatic     #49                 // Field WT:LOpcode;
     288: new           #4                  // class Opcode
     291: dup
     292: ldc           #50                 // String RI
     294: bipush        21
     296: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     299: putstatic     #51                 // Field RI:LOpcode;
     302: new           #4                  // class Opcode
     305: dup
     306: ldc           #52                 // String RF
     308: bipush        22
     310: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     313: putstatic     #53                 // Field RF:LOpcode;
     316: new           #4                  // class Opcode
     319: dup
     320: ldc           #54                 // String RT
     322: bipush        23
     324: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     327: putstatic     #55                 // Field RT:LOpcode;
     330: new           #4                  // class Opcode
     333: dup
     334: ldc           #56                 // String PC
     336: bipush        24
     338: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     341: putstatic     #57                 // Field PC:LOpcode;
     344: new           #4                  // class Opcode
     347: dup
     348: ldc           #58                 // String SP
     350: bipush        25
     352: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     355: putstatic     #59                 // Field SP:LOpcode;
     358: new           #4                  // class Opcode
     361: dup
     362: ldc           #60                 // String ASP
     364: bipush        26
     366: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     369: putstatic     #61                 // Field ASP:LOpcode;
     372: new           #4                  // class Opcode
     375: dup
     376: ldc           #62                 // String RET
     378: bipush        27
     380: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     383: putstatic     #63                 // Field RET:LOpcode;
     386: new           #4                  // class Opcode
     389: dup
     390: ldc           #64                 // String ISP
     392: bipush        28
     394: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     397: putstatic     #65                 // Field ISP:LOpcode;
     400: new           #4                  // class Opcode
     403: dup
     404: ldc           #66                 // String DSP
     406: bipush        29
     408: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     411: putstatic     #67                 // Field DSP:LOpcode;
     414: new           #4                  // class Opcode
     417: dup
     418: ldc           #68                 // String EX
     420: bipush        30
     422: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     425: putstatic     #69                 // Field EX:LOpcode;
     428: new           #4                  // class Opcode
     431: dup
     432: ldc           #70                 // String ARB
     434: bipush        31
     436: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     439: putstatic     #71                 // Field ARB:LOpcode;
     442: new           #4                  // class Opcode
     445: dup
     446: ldc           #72                 // String GMM
     448: bipush        32
     450: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     453: putstatic     #73                 // Field GMM:LOpcode;
     456: new           #4                  // class Opcode
     459: dup
     460: ldc           #74                 // String FMM
     462: bipush        33
     464: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     467: putstatic     #75                 // Field FMM:LOpcode;
     470: new           #4                  // class Opcode
     473: dup
     474: ldc           #76                 // String BAND
     476: bipush        34
     478: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     481: putstatic     #77                 // Field BAND:LOpcode;
     484: new           #4                  // class Opcode
     487: dup
     488: ldc           #78                 // String BOR
     490: bipush        35
     492: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     495: putstatic     #79                 // Field BOR:LOpcode;
     498: new           #4                  // class Opcode
     501: dup
     502: ldc           #80                 // String BNOT
     504: bipush        36
     506: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     509: putstatic     #81                 // Field BNOT:LOpcode;
     512: new           #4                  // class Opcode
     515: dup
     516: ldc           #82                 // String BXOR
     518: bipush        37
     520: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     523: putstatic     #83                 // Field BXOR:LOpcode;
     526: new           #4                  // class Opcode
     529: dup
     530: ldc           #84                 // String BSHR
     532: bipush        38
     534: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     537: putstatic     #85                 // Field BSHR:LOpcode;
     540: new           #4                  // class Opcode
     543: dup
     544: ldc           #86                 // String BSHL
     546: bipush        39
     548: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     551: putstatic     #87                 // Field BSHL:LOpcode;
     554: new           #4                  // class Opcode
     557: dup
     558: ldc           #88                 // String OVERFLOW
     560: bipush        40
     562: invokespecial #8                  // Method "<init>":(Ljava/lang/String;I)V
     565: putstatic     #89                 // Field OVERFLOW:LOpcode;
     568: bipush        41
     570: anewarray     #4                  // class Opcode
     573: dup
     574: iconst_0
     575: getstatic     #9                  // Field PLUS:LOpcode;
     578: aastore
     579: dup
     580: iconst_1
     581: getstatic     #11                 // Field MINUS:LOpcode;
     584: aastore
     585: dup
     586: iconst_2
     587: getstatic     #13                 // Field MUL:LOpcode;
     590: aastore
     591: dup
     592: iconst_3
     593: getstatic     #15                 // Field DIV:LOpcode;
     596: aastore
     597: dup
     598: iconst_4
     599: getstatic     #17                 // Field MOD:LOpcode;
     602: aastore
     603: dup
     604: iconst_5
     605: getstatic     #19                 // Field AND:LOpcode;
     608: aastore
     609: dup
     610: bipush        6
     612: getstatic     #21                 // Field OR:LOpcode;
     615: aastore
     616: dup
     617: bipush        7
     619: getstatic     #23                 // Field L:LOpcode;
     622: aastore
     623: dup
     624: bipush        8
     626: getstatic     #25                 // Field G:LOpcode;
     629: aastore
     630: dup
     631: bipush        9
     633: getstatic     #27                 // Field LE:LOpcode;
     636: aastore
     637: dup
     638: bipush        10
     640: getstatic     #29                 // Field GE:LOpcode;
     643: aastore
     644: dup
     645: bipush        11
     647: getstatic     #31                 // Field E:LOpcode;
     650: aastore
     651: dup
     652: bipush        12
     654: getstatic     #33                 // Field NE:LOpcode;
     657: aastore
     658: dup
     659: bipush        13
     661: getstatic     #35                 // Field NOT:LOpcode;
     664: aastore
     665: dup
     666: bipush        14
     668: getstatic     #37                 // Field UM:LOpcode;
     671: aastore
     672: dup
     673: bipush        15
     675: getstatic     #39                 // Field ASSIGN:LOpcode;
     678: aastore
     679: dup
     680: bipush        16
     682: getstatic     #41                 // Field JZ:LOpcode;
     685: aastore
     686: dup
     687: bipush        17
     689: getstatic     #43                 // Field JMP:LOpcode;
     692: aastore
     693: dup
     694: bipush        18
     696: getstatic     #45                 // Field WI:LOpcode;
     699: aastore
     700: dup
     701: bipush        19
     703: getstatic     #47                 // Field WF:LOpcode;
     706: aastore
     707: dup
     708: bipush        20
     710: getstatic     #49                 // Field WT:LOpcode;
     713: aastore
     714: dup
     715: bipush        21
     717: getstatic     #51                 // Field RI:LOpcode;
     720: aastore
     721: dup
     722: bipush        22
     724: getstatic     #53                 // Field RF:LOpcode;
     727: aastore
     728: dup
     729: bipush        23
     731: getstatic     #55                 // Field RT:LOpcode;
     734: aastore
     735: dup
     736: bipush        24
     738: getstatic     #57                 // Field PC:LOpcode;
     741: aastore
     742: dup
     743: bipush        25
     745: getstatic     #59                 // Field SP:LOpcode;
     748: aastore
     749: dup
     750: bipush        26
     752: getstatic     #61                 // Field ASP:LOpcode;
     755: aastore
     756: dup
     757: bipush        27
     759: getstatic     #63                 // Field RET:LOpcode;
     762: aastore
     763: dup
     764: bipush        28
     766: getstatic     #65                 // Field ISP:LOpcode;
     769: aastore
     770: dup
     771: bipush        29
     773: getstatic     #67                 // Field DSP:LOpcode;
     776: aastore
     777: dup
     778: bipush        30
     780: getstatic     #69                 // Field EX:LOpcode;
     783: aastore
     784: dup
     785: bipush        31
     787: getstatic     #71                 // Field ARB:LOpcode;
     790: aastore
     791: dup
     792: bipush        32
     794: getstatic     #73                 // Field GMM:LOpcode;
     797: aastore
     798: dup
     799: bipush        33
     801: getstatic     #75                 // Field FMM:LOpcode;
     804: aastore
     805: dup
     806: bipush        34
     808: getstatic     #77                 // Field BAND:LOpcode;
     811: aastore
     812: dup
     813: bipush        35
     815: getstatic     #79                 // Field BOR:LOpcode;
     818: aastore
     819: dup
     820: bipush        36
     822: getstatic     #81                 // Field BNOT:LOpcode;
     825: aastore
     826: dup
     827: bipush        37
     829: getstatic     #83                 // Field BXOR:LOpcode;
     832: aastore
     833: dup
     834: bipush        38
     836: getstatic     #85                 // Field BSHR:LOpcode;
     839: aastore
     840: dup
     841: bipush        39
     843: getstatic     #87                 // Field BSHL:LOpcode;
     846: aastore
     847: dup
     848: bipush        40
     850: getstatic     #89                 // Field OVERFLOW:LOpcode;
     853: aastore
     854: putstatic     #1                  // Field $VALUES:[LOpcode;
     857: return
}
