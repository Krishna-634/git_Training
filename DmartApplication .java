class DmartApplication {
    public static void main(String[] args) {
	String mode ="yes";
	double discount=0;
	double ShopingDiscount;
	String paymentmethod="Debit";
	double paymentDis=0;
        String billno="45412546-45136";
        String billdt="10/05/2025(11:20pm)";
        String vou_no ="52s654";
        String casher="045/r54";
        //items
        int item1No =1;
        int item1Hsn=41522;
        String item1Name="rice Bag";
        int item1Qty = 1;
        double item1Price =149.00;
        double n_Rate = item1Price / item1Qty;
        double item1Value =item1Price * item1Qty;
        double item1cgst = (2.50/100)*item1Value;
        double item1sgst = (2.50/100)*item1Value;
        double item1Total = item1Value+item1cgst+item1sgst;
        //item 2
        int item2no=1;
        int item2Hsn=20145;
        String item2Name="pen";
        int item2Qty = 2;
        double item2Price =10.00;
        double item2Value =item2Price * item2Qty;
        double item2n_Rate = item2Value/ item2Qty;
        double item2cgst = (0/100)*item2Value;
        double item2sgst = (0/100)*item2Value;
        double item2Total = item2Value+item2cgst+item2sgst;

	
        //total
        int totalItems =item1No+item2no;
        int  Qty = item1Qty +item2Qty;
        double amount =item1Value +item2Value;
        double totalTaxable=item1Value+item2Value;
        double totalcgst = item1cgst+item2cgst;
        double totalsgst = item1sgst+item2sgst;
        double totalAmt=item1Total+item2Total;
   
	if(mode=="yes")
	{
		 discount= totalAmt*(20.0/100);
	}
	else if(totalAmt >5000)
	{
		discount=(15.0/100)*totalAmt;
	}
	else
	{
		discount =0;
	}
	
	if(paymentmethod == "Debit")
	{
		paymentDis = (4.5/100)*totalAmt;
	}
	else if(paymentmethod =="credit")
	{
		paymentDis =(5.0/100)*totalAmt;
	}
	else if(paymentmethod =="Phonepay")
	{
		paymentDis =(4/100.0)*totalAmt;
	}
	else if(paymentmethod =="Gpay")
	{
		paymentDis=(3.5/100)*totalAmt;
	}
	else if(paymentmethod=="paytm")
	{
		paymentDis =(3/100.0)*totalAmt;
	}
	else{
		paymentDis =0;
	}

	double finalAmt=item1Total+item2Total-discount-paymentDis;
        
        
        System.out.println("                       D MART                        ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("                  AVENU SUPERMARKET LDT              ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("                  CIN :- L5402364121598P              ");
        System.out.println("                  GSTIN : 584PHSCHFGR65              ");
        System.out.println("                  FSSIA  -21451365                   ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
        System.out.println("                 Phase 10 336/2 and 336/3           ");
        System.out.println("                 KPHB Road malkajgiri                ");
        System.out.println("                    distric & HYD                    ");
        System.out.println("                       TS 500014                     ");
        System.out.println("                 phone no : XXXXXXXXX9               ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("                     TAX INVOICE                     ");
        System.out.print("Billno: "+billno);
        System.out.println("  bill dt: "+billdt);
        System.out.print("vou no: "+vou_no);
        System.out.println("          casher: "+casher);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- -");
        System.out.println("  HSN   Particular          Qty   N/Rate         Value     ");
       System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - -- - - - - -");
       System.out.println("       1) cgst @ 2.50%, sgst @ 2.50%");
       System.out.println( item1Hsn+"  "+item1Name+"               "+item1Qty+"   "+n_Rate+"           "+item1Value);
       System.out.println("       2)  cgst @ 0%, sgst @ 0%");
       System.out.println( item2Hsn+"  "+item2Name+"                    "+item2Qty+"   "+item2n_Rate+"          "+item2Value);
       System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - -- - - ");
       System.out.println( "  ITEMS  "+totalItems+"              QTY       "+Qty+"          "+amount);
       System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
       System.out.println("INO  TAXABLE AMt      cgst       SGST   Discount   PaymetDis    TOTAL AMT    ");
       System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - -  - -  ");
       System.out.println("1)  "+item1Value+"             "+item1cgst+"       "+item1sgst+"                             "+item1Total);
       System.out.println("2)  "+item2Value+"              "+item2cgst+"         "+item2sgst+"                                  "+item2Total);
       System.out.println("- - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - - -");
       System.out.println("   "+totalTaxable+"             "+totalcgst+"        "+totalsgst+"     " +discount +"    "+paymentDis);
       System.out.println("- - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - - -");
       System.out.println("                                                 Billing Amt :"+finalAmt);
       System.out.println("");
       System.out.println("                     amount Recieved From Customer    ");
       System.out.println("     At The End Review Amount Saved and Smile Thanks For Visiting");
       
       
       
       
        
    }
}