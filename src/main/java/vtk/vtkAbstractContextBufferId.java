// java wrapper for vtkAbstractContextBufferId object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractContextBufferId extends vtkObject
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

  private native int GetWidth_4();
  public int GetWidth()
  {
    return GetWidth_4();
  }

  private native void SetWidth_5(int id0);
  public void SetWidth(int id0)
  {
    SetWidth_5(id0);
  }

  private native int GetHeight_6();
  public int GetHeight()
  {
    return GetHeight_6();
  }

  private native void SetHeight_7(int id0);
  public void SetHeight(int id0)
  {
    SetHeight_7(id0);
  }

  private native void SetContext_8(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
  {
    SetContext_8(id0);
  }

  private native long GetContext_9();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_9();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsSupported_10();
  public boolean IsSupported()
  {
    return IsSupported_10();
  }

  private native void Allocate_11();
  public void Allocate()
  {
    Allocate_11();
  }

  private native boolean IsAllocated_12();
  public boolean IsAllocated()
  {
    return IsAllocated_12();
  }

  private native void SetValues_13(int id0,int id1);
  public void SetValues(int id0,int id1)
  {
    SetValues_13(id0,id1);
  }

  private native long GetPickedItem_14(int id0,int id1);
  public long GetPickedItem(int id0,int id1)
  {
    return GetPickedItem_14(id0,id1);
  }

  private native void ReleaseGraphicsResources_15();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_15();
  }

  public vtkAbstractContextBufferId() { super(); }

  public vtkAbstractContextBufferId(long id) { super(id); }
  public native long   VTKInit();

}
