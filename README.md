Making SOAP requests using Postman
We know it says Postman "REST" client, but that doesn't mean we can't use it for making SOAP requests. 
One can easily make any HTTP SOAP request using Postman by following these simple steps:

1. Give the SOAP endpoint as the URL. If you are using a WSDL, then give the path to the WSDL as the URL.URL for current project is:
"http://localhost:8080/RestFulExampleViaPostman/rest/po_allocation/invokerules"
Generic URL: http://<localhost>:<port number>/<Project name>/rest/po_allocation/invokerules

2. Set the request method to POST.

3. Open the raw editor, and set the body type as "text/xml".
in row editor,paste xml request into it.
REQUEST:

<?xml version="1.0"?>
<PurchaseOrderDetails>
<PurchaseOrder>
<PONumber>123459789</PONumber>
<POExpiryDate>12/11/2016</POExpiryDate>
<MRSalience>30</MRSalience>
<RetailerName>BigBazar</RetailerName>
<BranchCode>2</BranchCode>
<Article>
<ArticleNumber>784456971</ArticleNumber>
<PendingPOQuantity>50</PendingPOQuantity>
<BranchQuantity>100</BranchQuantity>
<HubQuantity>300</HubQuantity>
<DepotQuantity>23</DepotQuantity>
<Recommendations></Recommendations>
<Flag></Flag>
<RecommendedQuantity></RecommendedQuantity>
<Pcode>78945236</Pcode>
</Article>
<Article>
<ArticleNumber>343545456</ArticleNumber>
<PendingPOQuantity>60</PendingPOQuantity>
<BranchQuantity>10</BranchQuantity>
<HubQuantity>30</HubQuantity>
<DepotQuantity>23</DepotQuantity>
<Recommendations></Recommendations>
<Flag></Flag>
<RecommendedQuantity></RecommendedQuantity>
<Pcode>7894536</Pcode>
</Article>
</PurchaseOrder>
<PurchaseOrder>
<PONumber>9712345289</PONumber>
<POExpiryDate>12/12/2016</POExpiryDate>
<MRSalience>40</MRSalience>
<RetailerName>BigBazar</RetailerName>
<BranchCode>4</BranchCode>
<Article>
<ArticleNumber>784456971</ArticleNumber>
<PendingPOQuantity>50</PendingPOQuantity>
<BranchQuantity>100</BranchQuantity>
<HubQuantity>300</HubQuantity>
<DepotQuantity>23</DepotQuantity>
<Recommendations></Recommendations>
<Flag></Flag>
<RecommendedQuantity></RecommendedQuantity>
<Pcode>78945236</Pcode>
</Article>
<Article>
<ArticleNumber>343545456</ArticleNumber>
<PendingPOQuantity>60</PendingPOQuantity>
<BranchQuantity>10</BranchQuantity>
<HubQuantity>30</HubQuantity>
<DepotQuantity>23</DepotQuantity>
<Recommendations></Recommendations>
<Flag></Flag>
<RecommendedQuantity></RecommendedQuantity>
<Pcode>7894536</Pcode>
</Article>
</PurchaseOrder>
</PurchaseOrderDetails>
