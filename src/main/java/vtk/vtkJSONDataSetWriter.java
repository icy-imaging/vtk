// java wrapper for vtkJSONDataSetWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJSONDataSetWriter extends vtkWriter
{

  private native byte[] GetValidString_0(byte[] id0, int len0);
  public String GetValidString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetValidString_0(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native boolean WriteArrayContents_1(vtkDataArray id0,byte[] id1, int len1);
  public boolean WriteArrayContents(vtkDataArray id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return WriteArrayContents_1(id0,bytes1, bytes1.length);
  }

  private native boolean WriteArrayAsRAW_2(vtkDataArray id0,byte[] id1, int len1);
  public boolean WriteArrayAsRAW(vtkDataArray id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return WriteArrayAsRAW_2(id0,bytes1, bytes1.length);
  }

  private native int IsTypeOf_3(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_3(bytes0, bytes0.length);
  }

  private native int IsA_4(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_4(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_5(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_5(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_6(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_6(bytes0, bytes0.length);
  }

  private native long GetInput_7();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_8(int id0);
  public vtkDataSet GetInput(int id0)
  {
    long temp = GetInput_8(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetArchiver_9(vtkArchiver id0);
  public void SetArchiver(vtkArchiver id0)
  {
    SetArchiver_9(id0);
  }

  private native long GetArchiver_10();
  public vtkArchiver GetArchiver()
  {
    long temp = GetArchiver_10();

    if (temp == 0) return null;
    return (vtkArchiver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Write_11(vtkDataSet id0);
  public void Write(vtkDataSet id0)
  {
    Write_11(id0);
  }

  private native boolean IsDataSetValid_12();
  public boolean IsDataSetValid()
  {
    return IsDataSetValid_12();
  }

  private native int Write_13();
  public int Write()
  {
    return Write_13();
  }

  public vtkJSONDataSetWriter() { super(); }

  public vtkJSONDataSetWriter(long id) { super(id); }
  public native long   VTKInit();

}
