// java wrapper for vtkConnectivityFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConnectivityFilter extends vtkPointSetAlgorithm
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

  private native void SetScalarConnectivity_4(int id0);
  public void SetScalarConnectivity(int id0)
  {
    SetScalarConnectivity_4(id0);
  }

  private native int GetScalarConnectivity_5();
  public int GetScalarConnectivity()
  {
    return GetScalarConnectivity_5();
  }

  private native void ScalarConnectivityOn_6();
  public void ScalarConnectivityOn()
  {
    ScalarConnectivityOn_6();
  }

  private native void ScalarConnectivityOff_7();
  public void ScalarConnectivityOff()
  {
    ScalarConnectivityOff_7();
  }

  private native void SetScalarRange_8(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_8(id0,id1);
  }

  private native void SetScalarRange_9(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_9(id0);
  }

  private native double[] GetScalarRange_10();
  public double[] GetScalarRange()
  {
    return GetScalarRange_10();
  }

  private native void SetExtractionMode_11(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_11(id0);
  }

  private native int GetExtractionModeMinValue_12();
  public int GetExtractionModeMinValue()
  {
    return GetExtractionModeMinValue_12();
  }

  private native int GetExtractionModeMaxValue_13();
  public int GetExtractionModeMaxValue()
  {
    return GetExtractionModeMaxValue_13();
  }

  private native int GetExtractionMode_14();
  public int GetExtractionMode()
  {
    return GetExtractionMode_14();
  }

  private native void SetExtractionModeToPointSeededRegions_15();
  public void SetExtractionModeToPointSeededRegions()
  {
    SetExtractionModeToPointSeededRegions_15();
  }

  private native void SetExtractionModeToCellSeededRegions_16();
  public void SetExtractionModeToCellSeededRegions()
  {
    SetExtractionModeToCellSeededRegions_16();
  }

  private native void SetExtractionModeToLargestRegion_17();
  public void SetExtractionModeToLargestRegion()
  {
    SetExtractionModeToLargestRegion_17();
  }

  private native void SetExtractionModeToSpecifiedRegions_18();
  public void SetExtractionModeToSpecifiedRegions()
  {
    SetExtractionModeToSpecifiedRegions_18();
  }

  private native void SetExtractionModeToClosestPointRegion_19();
  public void SetExtractionModeToClosestPointRegion()
  {
    SetExtractionModeToClosestPointRegion_19();
  }

  private native void SetExtractionModeToAllRegions_20();
  public void SetExtractionModeToAllRegions()
  {
    SetExtractionModeToAllRegions_20();
  }

  private native byte[] GetExtractionModeAsString_21();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_21(), StandardCharsets.UTF_8);
  }

  private native void InitializeSeedList_22();
  public void InitializeSeedList()
  {
    InitializeSeedList_22();
  }

  private native void AddSeed_23(long id0);
  public void AddSeed(long id0)
  {
    AddSeed_23(id0);
  }

  private native void DeleteSeed_24(long id0);
  public void DeleteSeed(long id0)
  {
    DeleteSeed_24(id0);
  }

  private native void InitializeSpecifiedRegionList_25();
  public void InitializeSpecifiedRegionList()
  {
    InitializeSpecifiedRegionList_25();
  }

  private native void AddSpecifiedRegion_26(int id0);
  public void AddSpecifiedRegion(int id0)
  {
    AddSpecifiedRegion_26(id0);
  }

  private native void DeleteSpecifiedRegion_27(int id0);
  public void DeleteSpecifiedRegion(int id0)
  {
    DeleteSpecifiedRegion_27(id0);
  }

  private native void SetClosestPoint_28(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_28(id0,id1,id2);
  }

  private native void SetClosestPoint_29(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_29(id0);
  }

  private native double[] GetClosestPoint_30();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_30();
  }

  private native int GetNumberOfExtractedRegions_31();
  public int GetNumberOfExtractedRegions()
  {
    return GetNumberOfExtractedRegions_31();
  }

  private native void SetColorRegions_32(int id0);
  public void SetColorRegions(int id0)
  {
    SetColorRegions_32(id0);
  }

  private native int GetColorRegions_33();
  public int GetColorRegions()
  {
    return GetColorRegions_33();
  }

  private native void ColorRegionsOn_34();
  public void ColorRegionsOn()
  {
    ColorRegionsOn_34();
  }

  private native void ColorRegionsOff_35();
  public void ColorRegionsOff()
  {
    ColorRegionsOff_35();
  }

  private native void SetRegionIdAssignmentMode_36(int id0);
  public void SetRegionIdAssignmentMode(int id0)
  {
    SetRegionIdAssignmentMode_36(id0);
  }

  private native int GetRegionIdAssignmentMode_37();
  public int GetRegionIdAssignmentMode()
  {
    return GetRegionIdAssignmentMode_37();
  }

  private native void SetOutputPointsPrecision_38(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_38(id0);
  }

  private native int GetOutputPointsPrecision_39();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_39();
  }

  private native void SetCompressArrays_40(boolean id0);
  public void SetCompressArrays(boolean id0)
  {
    SetCompressArrays_40(id0);
  }

  private native boolean GetCompressArrays_41();
  public boolean GetCompressArrays()
  {
    return GetCompressArrays_41();
  }

  private native void CompressArraysOn_42();
  public void CompressArraysOn()
  {
    CompressArraysOn_42();
  }

  private native void CompressArraysOff_43();
  public void CompressArraysOff()
  {
    CompressArraysOff_43();
  }

  public vtkConnectivityFilter() { super(); }

  public vtkConnectivityFilter(long id) { super(id); }
  public native long   VTKInit();

}
