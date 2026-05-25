// java wrapper for vtkInteractorStyle3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyle3D extends vtkInteractorStyle
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

  private native void Dolly3D_4(vtkEventData id0);
  public void Dolly3D(vtkEventData id0)
  {
    Dolly3D_4(id0);
  }

  private native void SetDollyPhysicalSpeed_5(double id0);
  public void SetDollyPhysicalSpeed(double id0)
  {
    SetDollyPhysicalSpeed_5(id0);
  }

  private native double GetDollyPhysicalSpeed_6();
  public double GetDollyPhysicalSpeed()
  {
    return GetDollyPhysicalSpeed_6();
  }

  private native void SetScale_7(vtkCamera id0,double id1);
  public void SetScale(vtkCamera id0,double id1)
  {
    SetScale_7(id0,id1);
  }

  private native long GetInteractionPicker_8();
  public vtkAbstractPropPicker GetInteractionPicker()
  {
    long temp = GetInteractionPicker_8();

    if (temp == 0) return null;
    return (vtkAbstractPropPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionPicker_9(vtkAbstractPropPicker id0);
  public void SetInteractionPicker(vtkAbstractPropPicker id0)
  {
    SetInteractionPicker_9(id0);
  }

  public vtkInteractorStyle3D() { super(); }

  public vtkInteractorStyle3D(long id) { super(id); }
  public native long   VTKInit();

}
