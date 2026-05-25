// java wrapper for vtkImageExtractComponents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageExtractComponents extends vtkThreadedImageAlgorithm
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

  private native void SetComponents_4(int id0);
  public void SetComponents(int id0)
  {
    SetComponents_4(id0);
  }

  private native void SetComponents_5(int id0,int id1);
  public void SetComponents(int id0,int id1)
  {
    SetComponents_5(id0,id1);
  }

  private native void SetComponents_6(int id0,int id1,int id2);
  public void SetComponents(int id0,int id1,int id2)
  {
    SetComponents_6(id0,id1,id2);
  }

  private native int[] GetComponents_7();
  public int[] GetComponents()
  {
    return GetComponents_7();
  }

  private native int GetNumberOfComponents_8();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_8();
  }

  public vtkImageExtractComponents() { super(); }

  public vtkImageExtractComponents(long id) { super(id); }
  public native long   VTKInit();

}
