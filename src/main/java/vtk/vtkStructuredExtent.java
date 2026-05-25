// java wrapper for vtkStructuredExtent object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredExtent extends vtkObject
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

  private native void Clamp_4(int id0[],int id1[]);
  public void Clamp(int id0[],int id1[])
  {
    Clamp_4(id0,id1);
  }

  private native boolean StrictlySmaller_5(int id0[],int id1[]);
  public boolean StrictlySmaller(int id0[],int id1[])
  {
    return StrictlySmaller_5(id0,id1);
  }

  private native boolean Smaller_6(int id0[],int id1[]);
  public boolean Smaller(int id0[],int id1[])
  {
    return Smaller_6(id0,id1);
  }

  private native void Grow_7(int id0[],int id1);
  public void Grow(int id0[],int id1)
  {
    Grow_7(id0,id1);
  }

  private native void Grow_8(int id0[],int id1,int id2[]);
  public void Grow(int id0[],int id1,int id2[])
  {
    Grow_8(id0,id1,id2);
  }

  private native void Transform_9(int id0[],int id1[]);
  public void Transform(int id0[],int id1[])
  {
    Transform_9(id0,id1);
  }

  private native void GetDimensions_10(int id0[],int id1[]);
  public void GetDimensions(int id0[],int id1[])
  {
    GetDimensions_10(id0,id1);
  }

  public vtkStructuredExtent() { super(); }

  public vtkStructuredExtent(long id) { super(id); }
  public native long   VTKInit();

}
