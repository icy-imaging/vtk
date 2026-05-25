// java wrapper for vtkXMLHierarchicalBoxDataFileConverter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLHierarchicalBoxDataFileConverter extends vtkObject
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

  private native void SetInputFileName_4(byte[] id0, int len0);
  public void SetInputFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetInputFileName_5();
  public String GetInputFileName()
  {
    return new String(GetInputFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetOutputFileName_6(byte[] id0, int len0);
  public void SetOutputFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetOutputFileName_7();
  public String GetOutputFileName()
  {
    return new String(GetOutputFileName_7(), StandardCharsets.UTF_8);
  }

  private native boolean Convert_8();
  public boolean Convert()
  {
    return Convert_8();
  }

  public vtkXMLHierarchicalBoxDataFileConverter() { super(); }

  public vtkXMLHierarchicalBoxDataFileConverter(long id) { super(id); }
  public native long   VTKInit();

}
