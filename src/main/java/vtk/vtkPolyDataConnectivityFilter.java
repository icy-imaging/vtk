// java wrapper for vtkPolyDataConnectivityFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataConnectivityFilter extends vtkPolyDataAlgorithm
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

  private native long GetRegionSizes_4();
  public vtkIdTypeArray GetRegionSizes()
  {
    long temp = GetRegionSizes_4();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarConnectivity_5(int id0);
  public void SetScalarConnectivity(int id0)
  {
    SetScalarConnectivity_5(id0);
  }

  private native int GetScalarConnectivity_6();
  public int GetScalarConnectivity()
  {
    return GetScalarConnectivity_6();
  }

  private native void ScalarConnectivityOn_7();
  public void ScalarConnectivityOn()
  {
    ScalarConnectivityOn_7();
  }

  private native void ScalarConnectivityOff_8();
  public void ScalarConnectivityOff()
  {
    ScalarConnectivityOff_8();
  }

  private native void SetFullScalarConnectivity_9(int id0);
  public void SetFullScalarConnectivity(int id0)
  {
    SetFullScalarConnectivity_9(id0);
  }

  private native int GetFullScalarConnectivity_10();
  public int GetFullScalarConnectivity()
  {
    return GetFullScalarConnectivity_10();
  }

  private native void FullScalarConnectivityOn_11();
  public void FullScalarConnectivityOn()
  {
    FullScalarConnectivityOn_11();
  }

  private native void FullScalarConnectivityOff_12();
  public void FullScalarConnectivityOff()
  {
    FullScalarConnectivityOff_12();
  }

  private native void SetScalarRange_13(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_13(id0,id1);
  }

  private native void SetScalarRange_14(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_14(id0);
  }

  private native double[] GetScalarRange_15();
  public double[] GetScalarRange()
  {
    return GetScalarRange_15();
  }

  private native void SetExtractionMode_16(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_16(id0);
  }

  private native int GetExtractionModeMinValue_17();
  public int GetExtractionModeMinValue()
  {
    return GetExtractionModeMinValue_17();
  }

  private native int GetExtractionModeMaxValue_18();
  public int GetExtractionModeMaxValue()
  {
    return GetExtractionModeMaxValue_18();
  }

  private native int GetExtractionMode_19();
  public int GetExtractionMode()
  {
    return GetExtractionMode_19();
  }

  private native void SetExtractionModeToPointSeededRegions_20();
  public void SetExtractionModeToPointSeededRegions()
  {
    SetExtractionModeToPointSeededRegions_20();
  }

  private native void SetExtractionModeToCellSeededRegions_21();
  public void SetExtractionModeToCellSeededRegions()
  {
    SetExtractionModeToCellSeededRegions_21();
  }

  private native void SetExtractionModeToLargestRegion_22();
  public void SetExtractionModeToLargestRegion()
  {
    SetExtractionModeToLargestRegion_22();
  }

  private native void SetExtractionModeToSpecifiedRegions_23();
  public void SetExtractionModeToSpecifiedRegions()
  {
    SetExtractionModeToSpecifiedRegions_23();
  }

  private native void SetExtractionModeToClosestPointRegion_24();
  public void SetExtractionModeToClosestPointRegion()
  {
    SetExtractionModeToClosestPointRegion_24();
  }

  private native void SetExtractionModeToAllRegions_25();
  public void SetExtractionModeToAllRegions()
  {
    SetExtractionModeToAllRegions_25();
  }

  private native byte[] GetExtractionModeAsString_26();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_26(), StandardCharsets.UTF_8);
  }

  private native void InitializeSeedList_27();
  public void InitializeSeedList()
  {
    InitializeSeedList_27();
  }

  private native void AddSeed_28(int id0);
  public void AddSeed(int id0)
  {
    AddSeed_28(id0);
  }

  private native void DeleteSeed_29(int id0);
  public void DeleteSeed(int id0)
  {
    DeleteSeed_29(id0);
  }

  private native void InitializeSpecifiedRegionList_30();
  public void InitializeSpecifiedRegionList()
  {
    InitializeSpecifiedRegionList_30();
  }

  private native void AddSpecifiedRegion_31(int id0);
  public void AddSpecifiedRegion(int id0)
  {
    AddSpecifiedRegion_31(id0);
  }

  private native void DeleteSpecifiedRegion_32(int id0);
  public void DeleteSpecifiedRegion(int id0)
  {
    DeleteSpecifiedRegion_32(id0);
  }

  private native void SetClosestPoint_33(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_33(id0,id1,id2);
  }

  private native void SetClosestPoint_34(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_34(id0);
  }

  private native double[] GetClosestPoint_35();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_35();
  }

  private native int GetNumberOfExtractedRegions_36();
  public int GetNumberOfExtractedRegions()
  {
    return GetNumberOfExtractedRegions_36();
  }

  private native void SetColorRegions_37(int id0);
  public void SetColorRegions(int id0)
  {
    SetColorRegions_37(id0);
  }

  private native int GetColorRegions_38();
  public int GetColorRegions()
  {
    return GetColorRegions_38();
  }

  private native void ColorRegionsOn_39();
  public void ColorRegionsOn()
  {
    ColorRegionsOn_39();
  }

  private native void ColorRegionsOff_40();
  public void ColorRegionsOff()
  {
    ColorRegionsOff_40();
  }

  private native void SetMarkVisitedPointIds_41(int id0);
  public void SetMarkVisitedPointIds(int id0)
  {
    SetMarkVisitedPointIds_41(id0);
  }

  private native int GetMarkVisitedPointIds_42();
  public int GetMarkVisitedPointIds()
  {
    return GetMarkVisitedPointIds_42();
  }

  private native void MarkVisitedPointIdsOn_43();
  public void MarkVisitedPointIdsOn()
  {
    MarkVisitedPointIdsOn_43();
  }

  private native void MarkVisitedPointIdsOff_44();
  public void MarkVisitedPointIdsOff()
  {
    MarkVisitedPointIdsOff_44();
  }

  private native long GetVisitedPointIds_45();
  public vtkIdList GetVisitedPointIds()
  {
    long temp = GetVisitedPointIds_45();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_46(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_46(id0);
  }

  private native int GetOutputPointsPrecision_47();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_47();
  }

  public vtkPolyDataConnectivityFilter() { super(); }

  public vtkPolyDataConnectivityFilter(long id) { super(id); }
  public native long   VTKInit();

}
