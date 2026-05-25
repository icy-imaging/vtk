// java wrapper for vtkConnectedPointsFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConnectedPointsFilter extends vtkPolyDataAlgorithm
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetExtractionMode_8(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_8(id0);
  }

  private native int GetExtractionModeMinValue_9();
  public int GetExtractionModeMinValue()
  {
    return GetExtractionModeMinValue_9();
  }

  private native int GetExtractionModeMaxValue_10();
  public int GetExtractionModeMaxValue()
  {
    return GetExtractionModeMaxValue_10();
  }

  private native int GetExtractionMode_11();
  public int GetExtractionMode()
  {
    return GetExtractionMode_11();
  }

  private native void SetExtractionModeToPointSeededRegions_12();
  public void SetExtractionModeToPointSeededRegions()
  {
    SetExtractionModeToPointSeededRegions_12();
  }

  private native void SetExtractionModeToLargestRegion_13();
  public void SetExtractionModeToLargestRegion()
  {
    SetExtractionModeToLargestRegion_13();
  }

  private native void SetExtractionModeToSpecifiedRegions_14();
  public void SetExtractionModeToSpecifiedRegions()
  {
    SetExtractionModeToSpecifiedRegions_14();
  }

  private native void SetExtractionModeToClosestPointRegion_15();
  public void SetExtractionModeToClosestPointRegion()
  {
    SetExtractionModeToClosestPointRegion_15();
  }

  private native void SetExtractionModeToAllRegions_16();
  public void SetExtractionModeToAllRegions()
  {
    SetExtractionModeToAllRegions_16();
  }

  private native byte[] GetExtractionModeAsString_17();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_17(), StandardCharsets.UTF_8);
  }

  private native void SetClosestPoint_18(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_18(id0,id1,id2);
  }

  private native void SetClosestPoint_19(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_19(id0);
  }

  private native double[] GetClosestPoint_20();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_20();
  }

  private native void InitializeSeedList_21();
  public void InitializeSeedList()
  {
    InitializeSeedList_21();
  }

  private native void AddSeed_22(long id0);
  public void AddSeed(long id0)
  {
    AddSeed_22(id0);
  }

  private native void DeleteSeed_23(long id0);
  public void DeleteSeed(long id0)
  {
    DeleteSeed_23(id0);
  }

  private native void InitializeSpecifiedRegionList_24();
  public void InitializeSpecifiedRegionList()
  {
    InitializeSpecifiedRegionList_24();
  }

  private native void AddSpecifiedRegion_25(long id0);
  public void AddSpecifiedRegion(long id0)
  {
    AddSpecifiedRegion_25(id0);
  }

  private native void DeleteSpecifiedRegion_26(long id0);
  public void DeleteSpecifiedRegion(long id0)
  {
    DeleteSpecifiedRegion_26(id0);
  }

  private native void SetAlignedNormals_27(int id0);
  public void SetAlignedNormals(int id0)
  {
    SetAlignedNormals_27(id0);
  }

  private native int GetAlignedNormals_28();
  public int GetAlignedNormals()
  {
    return GetAlignedNormals_28();
  }

  private native void AlignedNormalsOn_29();
  public void AlignedNormalsOn()
  {
    AlignedNormalsOn_29();
  }

  private native void AlignedNormalsOff_30();
  public void AlignedNormalsOff()
  {
    AlignedNormalsOff_30();
  }

  private native void SetNormalAngle_31(double id0);
  public void SetNormalAngle(double id0)
  {
    SetNormalAngle_31(id0);
  }

  private native double GetNormalAngleMinValue_32();
  public double GetNormalAngleMinValue()
  {
    return GetNormalAngleMinValue_32();
  }

  private native double GetNormalAngleMaxValue_33();
  public double GetNormalAngleMaxValue()
  {
    return GetNormalAngleMaxValue_33();
  }

  private native double GetNormalAngle_34();
  public double GetNormalAngle()
  {
    return GetNormalAngle_34();
  }

  private native void SetScalarConnectivity_35(int id0);
  public void SetScalarConnectivity(int id0)
  {
    SetScalarConnectivity_35(id0);
  }

  private native int GetScalarConnectivity_36();
  public int GetScalarConnectivity()
  {
    return GetScalarConnectivity_36();
  }

  private native void ScalarConnectivityOn_37();
  public void ScalarConnectivityOn()
  {
    ScalarConnectivityOn_37();
  }

  private native void ScalarConnectivityOff_38();
  public void ScalarConnectivityOff()
  {
    ScalarConnectivityOff_38();
  }

  private native void SetScalarRange_39(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_39(id0,id1);
  }

  private native void SetScalarRange_40(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_40(id0);
  }

  private native double[] GetScalarRange_41();
  public double[] GetScalarRange()
  {
    return GetScalarRange_41();
  }

  private native int GetNumberOfExtractedRegions_42();
  public int GetNumberOfExtractedRegions()
  {
    return GetNumberOfExtractedRegions_42();
  }

  private native void SetLocator_43(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_43(id0);
  }

  private native long GetLocator_44();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_44();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkConnectedPointsFilter() { super(); }

  public vtkConnectedPointsFilter(long id) { super(id); }
  public native long   VTKInit();

}
