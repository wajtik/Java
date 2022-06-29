SELECT CampaignId, AVG(Amount)
FROM Opportunity
GROUP BY CampaignId