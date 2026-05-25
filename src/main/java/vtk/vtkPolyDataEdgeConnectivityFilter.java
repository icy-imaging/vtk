// java wrapper for vtkPolyDataEdgeConnectivityFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataEdgeConnectivityFilter extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetExtractionMode_4(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_4(id0);
  }

  private native int GetExtractionModeMinValue_5();
  public int GetExtractionModeMinValue()
  {
    return GetExtractionModeMinValue_5();
  }

  private native int GetExtractionModeMaxValue_6();
  public int GetExtractionModeMaxValue()
  {
    return GetExtractionModeMaxValue_6();
  }

  private native int GetExtractionMode_7();
  public int GetExtractionMode()
  {
    return GetExtractionMode_7();
  }

  private native void SetExtractionModeToPointSeededRegions_8();
  public void SetExtractionModeToPointSeededRegions()
  {
    SetExtractionModeToPointSeededRegions_8();
  }

  private native void SetExtractionModeToCellSeededRegions_9();
  public void SetExtractionModeToCellSeededRegions()
  {
    SetExtractionModeToCellSeededRegions_9();
  }

  private native void SetExtractionModeToLargestRegion_10();
  public void SetExtractionModeToLargestRegion()
  {
    SetExtractionModeToLargestRegion_10();
  }

  private native void SetExtractionModeToSpecifiedRegions_11();
  public void SetExtractionModeToSpecifiedRegions()
  {
    SetExtractionModeToSpecifiedRegions_11();
  }

  private native void SetExtractionModeToClosestPointRegion_12();
  public void SetExtractionModeToClosestPointRegion()
  {
    SetExtractionModeToClosestPointRegion_12();
  }

  private native void SetExtractionModeToLargeRegions_13();
  public void SetExtractionModeToLargeRegions()
  {
    SetExtractionModeToLargeRegions_13();
  }

  private native void SetExtractionModeToAllRegions_14();
  public void SetExtractionModeToAllRegions()
  {
    SetExtractionModeToAllRegions_14();
  }

  private native byte[] GetExtractionModeAsString_15();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_15(), StandardCharsets.UTF_8);
  }

  private native void SetBarrierEdges_16(int id0);
  public void SetBarrierEdges(int id0)
  {
    SetBarrierEdges_16(id0);
  }

  private native int GetBarrierEdges_17();
  public int GetBarrierEdges()
  {
    return GetBarrierEdges_17();
  }

  private native void BarrierEdgesOn_18();
  public void BarrierEdgesOn()
  {
    BarrierEdgesOn_18();
  }

  private native void BarrierEdgesOff_19();
  public void BarrierEdgesOff()
  {
    BarrierEdgesOff_19();
  }

  private native void SetSourceData_20(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_20(id0);
  }

  private native void SetSourceConnection_21(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_21(id0);
  }

  private native long GetSource_22();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_22();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBarrierEdgeLength_23(double id0,double id1);
  public void SetBarrierEdgeLength(double id0,double id1)
  {
    SetBarrierEdgeLength_23(id0,id1);
  }

  private native void SetBarrierEdgeLength_24(double id0[]);
  public void SetBarrierEdgeLength(double id0[])
  {
    SetBarrierEdgeLength_24(id0);
  }

  private native double[] GetBarrierEdgeLength_25();
  public double[] GetBarrierEdgeLength()
  {
    return GetBarrierEdgeLength_25();
  }

  private native void SetScalarConnectivity_26(int id0);
  public void SetScalarConnectivity(int id0)
  {
    SetScalarConnectivity_26(id0);
  }

  private native int GetScalarConnectivity_27();
  public int GetScalarConnectivity()
  {
    return GetScalarConnectivity_27();
  }

  private native void ScalarConnectivityOn_28();
  public void ScalarConnectivityOn()
  {
    ScalarConnectivityOn_28();
  }

  private native void ScalarConnectivityOff_29();
  public void ScalarConnectivityOff()
  {
    ScalarConnectivityOff_29();
  }

  private native void SetScalarRange_30(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_30(id0,id1);
  }

  private native void SetScalarRange_31(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_31(id0);
  }

  private native double[] GetScalarRange_32();
  public double[] GetScalarRange()
  {
    return GetScalarRange_32();
  }

  private native long GetRegionSizes_33();
  public vtkIdTypeArray GetRegionSizes()
  {
    long temp = GetRegionSizes_33();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeSeedList_34();
  public void InitializeSeedList()
  {
    InitializeSeedList_34();
  }

  private native void AddSeed_35(int id0);
  public void AddSeed(int id0)
  {
    AddSeed_35(id0);
  }

  private native void DeleteSeed_36(int id0);
  public void DeleteSeed(int id0)
  {
    DeleteSeed_36(id0);
  }

  private native void InitializeSpecifiedRegionList_37();
  public void InitializeSpecifiedRegionList()
  {
    InitializeSpecifiedRegionList_37();
  }

  private native void AddSpecifiedRegion_38(int id0);
  public void AddSpecifiedRegion(int id0)
  {
    AddSpecifiedRegion_38(id0);
  }

  private native void DeleteSpecifiedRegion_39(int id0);
  public void DeleteSpecifiedRegion(int id0)
  {
    DeleteSpecifiedRegion_39(id0);
  }

  private native int GetNumberOfSpecifiedRegions_40();
  public int GetNumberOfSpecifiedRegions()
  {
    return GetNumberOfSpecifiedRegions_40();
  }

  private native void SetClosestPoint_41(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_41(id0,id1,id2);
  }

  private native void SetClosestPoint_42(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_42(id0);
  }

  private native double[] GetClosestPoint_43();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_43();
  }

  private native void SetRegionGrowing_44(int id0);
  public void SetRegionGrowing(int id0)
  {
    SetRegionGrowing_44(id0);
  }

  private native int GetRegionGrowingMinValue_45();
  public int GetRegionGrowingMinValue()
  {
    return GetRegionGrowingMinValue_45();
  }

  private native int GetRegionGrowingMaxValue_46();
  public int GetRegionGrowingMaxValue()
  {
    return GetRegionGrowingMaxValue_46();
  }

  private native int GetRegionGrowing_47();
  public int GetRegionGrowing()
  {
    return GetRegionGrowing_47();
  }

  private native void SetRegionGrowingOff_48();
  public void SetRegionGrowingOff()
  {
    SetRegionGrowingOff_48();
  }

  private native void GrowLargeRegionsOff_49();
  public void GrowLargeRegionsOff()
  {
    GrowLargeRegionsOff_49();
  }

  private native void GrowSmallRegionsOff_50();
  public void GrowSmallRegionsOff()
  {
    GrowSmallRegionsOff_50();
  }

  private native void SetRegionGrowingToLargeRegions_51();
  public void SetRegionGrowingToLargeRegions()
  {
    SetRegionGrowingToLargeRegions_51();
  }

  private native void GrowLargeRegionsOn_52();
  public void GrowLargeRegionsOn()
  {
    GrowLargeRegionsOn_52();
  }

  private native void SetRegionGrowingToSmallRegions_53();
  public void SetRegionGrowingToSmallRegions()
  {
    SetRegionGrowingToSmallRegions_53();
  }

  private native void GrowSmallRegionsOn_54();
  public void GrowSmallRegionsOn()
  {
    GrowSmallRegionsOn_54();
  }

  private native void SetLargeRegionThreshold_55(double id0);
  public void SetLargeRegionThreshold(double id0)
  {
    SetLargeRegionThreshold_55(id0);
  }

  private native double GetLargeRegionThresholdMinValue_56();
  public double GetLargeRegionThresholdMinValue()
  {
    return GetLargeRegionThresholdMinValue_56();
  }

  private native double GetLargeRegionThresholdMaxValue_57();
  public double GetLargeRegionThresholdMaxValue()
  {
    return GetLargeRegionThresholdMaxValue_57();
  }

  private native double GetLargeRegionThreshold_58();
  public double GetLargeRegionThreshold()
  {
    return GetLargeRegionThreshold_58();
  }

  private native int GetNumberOfExtractedRegions_59();
  public int GetNumberOfExtractedRegions()
  {
    return GetNumberOfExtractedRegions_59();
  }

  private native double GetTotalArea_60();
  public double GetTotalArea()
  {
    return GetTotalArea_60();
  }

  private native void SetColorRegions_61(int id0);
  public void SetColorRegions(int id0)
  {
    SetColorRegions_61(id0);
  }

  private native int GetColorRegions_62();
  public int GetColorRegions()
  {
    return GetColorRegions_62();
  }

  private native void ColorRegionsOn_63();
  public void ColorRegionsOn()
  {
    ColorRegionsOn_63();
  }

  private native void ColorRegionsOff_64();
  public void ColorRegionsOff()
  {
    ColorRegionsOff_64();
  }

  private native void SetCellRegionAreas_65(int id0);
  public void SetCellRegionAreas(int id0)
  {
    SetCellRegionAreas_65(id0);
  }

  private native int GetCellRegionAreas_66();
  public int GetCellRegionAreas()
  {
    return GetCellRegionAreas_66();
  }

  private native void CellRegionAreasOn_67();
  public void CellRegionAreasOn()
  {
    CellRegionAreasOn_67();
  }

  private native void CellRegionAreasOff_68();
  public void CellRegionAreasOff()
  {
    CellRegionAreasOff_68();
  }

  private native void SetOutputPointsPrecision_69(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_69(id0);
  }

  private native int GetOutputPointsPrecision_70();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_70();
  }

  public vtkPolyDataEdgeConnectivityFilter() { super(); }

  public vtkPolyDataEdgeConnectivityFilter(long id) { super(id); }
  public native long   VTKInit();

}
