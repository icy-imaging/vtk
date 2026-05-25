// java wrapper for vtkPCACurvatureEstimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPCACurvatureEstimation extends vtkPolyDataAlgorithm
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

  private native void SetSampleSize_4(int id0);
  public void SetSampleSize(int id0)
  {
    SetSampleSize_4(id0);
  }

  private native int GetSampleSizeMinValue_5();
  public int GetSampleSizeMinValue()
  {
    return GetSampleSizeMinValue_5();
  }

  private native int GetSampleSizeMaxValue_6();
  public int GetSampleSizeMaxValue()
  {
    return GetSampleSizeMaxValue_6();
  }

  private native int GetSampleSize_7();
  public int GetSampleSize()
  {
    return GetSampleSize_7();
  }

  private native void SetLocator_8(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_8(id0);
  }

  private native long GetLocator_9();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_9();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPCACurvatureEstimation() { super(); }

  public vtkPCACurvatureEstimation(long id) { super(id); }
  public native long   VTKInit();

}
