// java wrapper for vtkJavaScriptDataWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJavaScriptDataWriter extends vtkWriter
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

  private native void SetVariableName_4(byte[] id0, int len0);
  public void SetVariableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVariableName_4(bytes0, bytes0.length);
  }

  private native byte[] GetVariableName_5();
  public String GetVariableName()
  {
    return new String(GetVariableName_5(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetIncludeFieldNames_8(boolean id0);
  public void SetIncludeFieldNames(boolean id0)
  {
    SetIncludeFieldNames_8(id0);
  }

  private native boolean GetIncludeFieldNames_9();
  public boolean GetIncludeFieldNames()
  {
    return GetIncludeFieldNames_9();
  }

  public vtkJavaScriptDataWriter() { super(); }

  public vtkJavaScriptDataWriter(long id) { super(id); }
  public native long   VTKInit();

}
