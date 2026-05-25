// java wrapper for vtkRadiusOutlierRemoval object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRadiusOutlierRemoval extends vtkPointCloudFilter
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

  private native void SetNumberOfNeighbors_8(int id0);
  public void SetNumberOfNeighbors(int id0)
  {
    SetNumberOfNeighbors_8(id0);
  }

  private native int GetNumberOfNeighborsMinValue_9();
  public int GetNumberOfNeighborsMinValue()
  {
    return GetNumberOfNeighborsMinValue_9();
  }

  private native int GetNumberOfNeighborsMaxValue_10();
  public int GetNumberOfNeighborsMaxValue()
  {
    return GetNumberOfNeighborsMaxValue_10();
  }

  private native int GetNumberOfNeighbors_11();
  public int GetNumberOfNeighbors()
  {
    return GetNumberOfNeighbors_11();
  }

  private native void SetLocator_12(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_12(id0);
  }

  private native long GetLocator_13();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_13();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkRadiusOutlierRemoval() { super(); }

  public vtkRadiusOutlierRemoval(long id) { super(id); }
  public native long   VTKInit();

}
