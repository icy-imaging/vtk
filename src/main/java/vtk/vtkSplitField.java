// java wrapper for vtkSplitField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplitField extends vtkDataSetAlgorithm
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

  private native void SetInputField_4(int id0,int id1);
  public void SetInputField(int id0,int id1)
  {
    SetInputField_4(id0,id1);
  }

  private native void SetInputField_5(byte[] id0, int len0,int id1);
  public void SetInputField(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputField_5(bytes0, bytes0.length,id1);
  }

  private native void SetInputField_6(byte[] id0, int len0,byte[] id1, int len1);
  public void SetInputField(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputField_6(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void Split_7(int id0,byte[] id1, int len1);
  public void Split(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Split_7(id0,bytes1, bytes1.length);
  }

  public vtkSplitField() { super(); }

  public vtkSplitField(long id) { super(id); }
  public native long   VTKInit();

}
