// java wrapper for vtkPCANormalEstimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPCANormalEstimation extends vtkPolyDataAlgorithm
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

  private native void SetSearchMode_4(int id0);
  public void SetSearchMode(int id0)
  {
    SetSearchMode_4(id0);
  }

  private native int GetSearchMode_5();
  public int GetSearchMode()
  {
    return GetSearchMode_5();
  }

  private native void SetSearchModeToKNN_6();
  public void SetSearchModeToKNN()
  {
    SetSearchModeToKNN_6();
  }

  private native void SetSearchModeToRadius_7();
  public void SetSearchModeToRadius()
  {
    SetSearchModeToRadius_7();
  }

  private native void SetSampleSize_8(int id0);
  public void SetSampleSize(int id0)
  {
    SetSampleSize_8(id0);
  }

  private native int GetSampleSizeMinValue_9();
  public int GetSampleSizeMinValue()
  {
    return GetSampleSizeMinValue_9();
  }

  private native int GetSampleSizeMaxValue_10();
  public int GetSampleSizeMaxValue()
  {
    return GetSampleSizeMaxValue_10();
  }

  private native int GetSampleSize_11();
  public int GetSampleSize()
  {
    return GetSampleSize_11();
  }

  private native void SetRadius_12(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_12(id0);
  }

  private native double GetRadius_13();
  public double GetRadius()
  {
    return GetRadius_13();
  }

  private native void SetNormalOrientation_14(int id0);
  public void SetNormalOrientation(int id0)
  {
    SetNormalOrientation_14(id0);
  }

  private native int GetNormalOrientation_15();
  public int GetNormalOrientation()
  {
    return GetNormalOrientation_15();
  }

  private native void SetNormalOrientationToAsComputed_16();
  public void SetNormalOrientationToAsComputed()
  {
    SetNormalOrientationToAsComputed_16();
  }

  private native void SetNormalOrientationToPoint_17();
  public void SetNormalOrientationToPoint()
  {
    SetNormalOrientationToPoint_17();
  }

  private native void SetNormalOrientationToGraphTraversal_18();
  public void SetNormalOrientationToGraphTraversal()
  {
    SetNormalOrientationToGraphTraversal_18();
  }

  private native void SetOrientationPoint_19(double id0,double id1,double id2);
  public void SetOrientationPoint(double id0,double id1,double id2)
  {
    SetOrientationPoint_19(id0,id1,id2);
  }

  private native void SetOrientationPoint_20(double id0[]);
  public void SetOrientationPoint(double id0[])
  {
    SetOrientationPoint_20(id0);
  }

  private native double[] GetOrientationPoint_21();
  public double[] GetOrientationPoint()
  {
    return GetOrientationPoint_21();
  }

  private native void SetFlipNormals_22(boolean id0);
  public void SetFlipNormals(boolean id0)
  {
    SetFlipNormals_22(id0);
  }

  private native boolean GetFlipNormals_23();
  public boolean GetFlipNormals()
  {
    return GetFlipNormals_23();
  }

  private native void FlipNormalsOn_24();
  public void FlipNormalsOn()
  {
    FlipNormalsOn_24();
  }

  private native void FlipNormalsOff_25();
  public void FlipNormalsOff()
  {
    FlipNormalsOff_25();
  }

  private native void SetLocator_26(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_26(id0);
  }

  private native long GetLocator_27();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_27();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPCANormalEstimation() { super(); }

  public vtkPCANormalEstimation(long id) { super(id); }
  public native long   VTKInit();

}
