// java wrapper for vtkIterativeClosestPointTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIterativeClosestPointTransform extends vtkLinearTransform
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

  private native void SetSource_4(vtkDataSet id0);
  public void SetSource(vtkDataSet id0)
  {
    SetSource_4(id0);
  }

  private native void SetTarget_5(vtkDataSet id0);
  public void SetTarget(vtkDataSet id0)
  {
    SetTarget_5(id0);
  }

  private native long GetSource_6();
  public vtkDataSet GetSource()
  {
    long temp = GetSource_6();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTarget_7();
  public vtkDataSet GetTarget()
  {
    long temp = GetTarget_7();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_8(vtkCellLocator id0);
  public void SetLocator(vtkCellLocator id0)
  {
    SetLocator_8(id0);
  }

  private native long GetLocator_9();
  public vtkCellLocator GetLocator()
  {
    long temp = GetLocator_9();

    if (temp == 0) return null;
    return (vtkCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaximumNumberOfIterations_10(int id0);
  public void SetMaximumNumberOfIterations(int id0)
  {
    SetMaximumNumberOfIterations_10(id0);
  }

  private native int GetMaximumNumberOfIterations_11();
  public int GetMaximumNumberOfIterations()
  {
    return GetMaximumNumberOfIterations_11();
  }

  private native int GetNumberOfIterations_12();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_12();
  }

  private native void SetCheckMeanDistance_13(int id0);
  public void SetCheckMeanDistance(int id0)
  {
    SetCheckMeanDistance_13(id0);
  }

  private native int GetCheckMeanDistance_14();
  public int GetCheckMeanDistance()
  {
    return GetCheckMeanDistance_14();
  }

  private native void CheckMeanDistanceOn_15();
  public void CheckMeanDistanceOn()
  {
    CheckMeanDistanceOn_15();
  }

  private native void CheckMeanDistanceOff_16();
  public void CheckMeanDistanceOff()
  {
    CheckMeanDistanceOff_16();
  }

  private native void SetMeanDistanceMode_17(int id0);
  public void SetMeanDistanceMode(int id0)
  {
    SetMeanDistanceMode_17(id0);
  }

  private native int GetMeanDistanceModeMinValue_18();
  public int GetMeanDistanceModeMinValue()
  {
    return GetMeanDistanceModeMinValue_18();
  }

  private native int GetMeanDistanceModeMaxValue_19();
  public int GetMeanDistanceModeMaxValue()
  {
    return GetMeanDistanceModeMaxValue_19();
  }

  private native int GetMeanDistanceMode_20();
  public int GetMeanDistanceMode()
  {
    return GetMeanDistanceMode_20();
  }

  private native void SetMeanDistanceModeToRMS_21();
  public void SetMeanDistanceModeToRMS()
  {
    SetMeanDistanceModeToRMS_21();
  }

  private native void SetMeanDistanceModeToAbsoluteValue_22();
  public void SetMeanDistanceModeToAbsoluteValue()
  {
    SetMeanDistanceModeToAbsoluteValue_22();
  }

  private native byte[] GetMeanDistanceModeAsString_23();
  public String GetMeanDistanceModeAsString()
  {
    return new String(GetMeanDistanceModeAsString_23(), StandardCharsets.UTF_8);
  }

  private native void SetMaximumMeanDistance_24(double id0);
  public void SetMaximumMeanDistance(double id0)
  {
    SetMaximumMeanDistance_24(id0);
  }

  private native double GetMaximumMeanDistance_25();
  public double GetMaximumMeanDistance()
  {
    return GetMaximumMeanDistance_25();
  }

  private native double GetMeanDistance_26();
  public double GetMeanDistance()
  {
    return GetMeanDistance_26();
  }

  private native void SetMaximumNumberOfLandmarks_27(int id0);
  public void SetMaximumNumberOfLandmarks(int id0)
  {
    SetMaximumNumberOfLandmarks_27(id0);
  }

  private native int GetMaximumNumberOfLandmarks_28();
  public int GetMaximumNumberOfLandmarks()
  {
    return GetMaximumNumberOfLandmarks_28();
  }

  private native void SetStartByMatchingCentroids_29(int id0);
  public void SetStartByMatchingCentroids(int id0)
  {
    SetStartByMatchingCentroids_29(id0);
  }

  private native int GetStartByMatchingCentroids_30();
  public int GetStartByMatchingCentroids()
  {
    return GetStartByMatchingCentroids_30();
  }

  private native void StartByMatchingCentroidsOn_31();
  public void StartByMatchingCentroidsOn()
  {
    StartByMatchingCentroidsOn_31();
  }

  private native void StartByMatchingCentroidsOff_32();
  public void StartByMatchingCentroidsOff()
  {
    StartByMatchingCentroidsOff_32();
  }

  private native long GetLandmarkTransform_33();
  public vtkLandmarkTransform GetLandmarkTransform()
  {
    long temp = GetLandmarkTransform_33();

    if (temp == 0) return null;
    return (vtkLandmarkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Inverse_34();
  public void Inverse()
  {
    Inverse_34();
  }

  private native long MakeTransform_35();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_35();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIterativeClosestPointTransform() { super(); }

  public vtkIterativeClosestPointTransform(long id) { super(id); }
  public native long   VTKInit();

}
