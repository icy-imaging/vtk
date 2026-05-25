// java wrapper for vtkXMLHierarchicalBoxDataWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLHierarchicalBoxDataWriter extends vtkXMLUniformGridAMRWriter
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

  private native byte[] GetDefaultFileExtension_4();
  public String GetDefaultFileExtension()
  {
    return new String(GetDefaultFileExtension_4(), StandardCharsets.UTF_8);
  }

  public vtkXMLHierarchicalBoxDataWriter() { super(); }

  public vtkXMLHierarchicalBoxDataWriter(long id) { super(id); }
  public native long   VTKInit();

}
