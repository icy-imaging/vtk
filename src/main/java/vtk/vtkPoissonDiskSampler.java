// java wrapper for vtkPoissonDiskSampler object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPoissonDiskSampler extends vtkPointSetAlgorithm
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

  private native double GetRadius_5();
  public double GetRadius()
  {
    return GetRadius_5();
  }

  private native void SetLocator_6(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_6(id0);
  }

  private native long GetLocator_7();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_7();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPoissonDiskSampler() { super(); }

  public vtkPoissonDiskSampler(long id) { super(id); }
  public native long   VTKInit();

}
