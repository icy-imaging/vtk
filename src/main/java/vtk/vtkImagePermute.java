// java wrapper for vtkImagePermute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImagePermute extends vtkImageReslice
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

  private native void SetFilteredAxes_4(int id0,int id1,int id2);
  public void SetFilteredAxes(int id0,int id1,int id2)
  {
    SetFilteredAxes_4(id0,id1,id2);
  }

  private native void SetFilteredAxes_5(int id0[]);
  public void SetFilteredAxes(int id0[])
  {
    SetFilteredAxes_5(id0);
  }

  private native int[] GetFilteredAxes_6();
  public int[] GetFilteredAxes()
  {
    return GetFilteredAxes_6();
  }

  public vtkImagePermute() { super(); }

  public vtkImagePermute(long id) { super(id); }
  public native long   VTKInit();

}
