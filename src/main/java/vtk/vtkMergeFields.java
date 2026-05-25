// java wrapper for vtkMergeFields object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeFields extends vtkDataSetAlgorithm
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

  private native void SetOutputField_4(byte[] id0, int len0,int id1);
  public void SetOutputField(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputField_4(bytes0, bytes0.length,id1);
  }

  private native void SetOutputField_5(byte[] id0, int len0,byte[] id1, int len1);
  public void SetOutputField(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetOutputField_5(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void Merge_6(int id0,byte[] id1, int len1,int id2);
  public void Merge(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Merge_6(id0,bytes1, bytes1.length,id2);
  }

  private native void SetNumberOfComponents_7(int id0);
  public void SetNumberOfComponents(int id0)
  {
    SetNumberOfComponents_7(id0);
  }

  private native int GetNumberOfComponents_8();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_8();
  }

  public vtkMergeFields() { super(); }

  public vtkMergeFields(long id) { super(id); }
  public native long   VTKInit();

}
