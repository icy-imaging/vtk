// java wrapper for vtkArrayReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayReader extends vtkArrayDataAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native void SetInputString_6(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_6(bytes0, bytes0.length);
  }

  private native byte[] GetInputString_7();
  public String GetInputString()
  {
    return new String(GetInputString_7(), StandardCharsets.UTF_8);
  }

  private native void SetReadFromInputString_8(boolean id0);
  public void SetReadFromInputString(boolean id0)
  {
    SetReadFromInputString_8(id0);
  }

  private native boolean GetReadFromInputString_9();
  public boolean GetReadFromInputString()
  {
    return GetReadFromInputString_9();
  }

  private native void ReadFromInputStringOn_10();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_10();
  }

  private native void ReadFromInputStringOff_11();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_11();
  }

  private native long Read_12(byte[] id0, int len0);
  public vtkArray Read(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = Read_12(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkArrayReader() { super(); }

  public vtkArrayReader(long id) { super(id); }
  public native long   VTKInit();

}
