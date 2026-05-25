// java wrapper for vtkXMLPolyDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLPolyDataReader extends vtkXMLUnstructuredDataReader
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

  private native long GetOutput_4();
  public vtkPolyData GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkPolyData GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfVerts_6();
  public long GetNumberOfVerts()
  {
    return GetNumberOfVerts_6();
  }

  private native long GetNumberOfLines_7();
  public long GetNumberOfLines()
  {
    return GetNumberOfLines_7();
  }

  private native long GetNumberOfStrips_8();
  public long GetNumberOfStrips()
  {
    return GetNumberOfStrips_8();
  }

  private native long GetNumberOfPolys_9();
  public long GetNumberOfPolys()
  {
    return GetNumberOfPolys_9();
  }

  public vtkXMLPolyDataReader() { super(); }

  public vtkXMLPolyDataReader(long id) { super(id); }
  public native long   VTKInit();

}
