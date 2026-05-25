// java wrapper for vtkXMLUtilities object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLUtilities extends vtkObject
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

  private native long ReadElementFromString_4(byte[] id0, int len0,int id1);
  public vtkXMLDataElement ReadElementFromString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = ReadElementFromString_4(bytes0, bytes0.length,id1);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ReadElementFromFile_5(byte[] id0, int len0,int id1);
  public vtkXMLDataElement ReadElementFromFile(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = ReadElementFromFile_5(bytes0, bytes0.length,id1);

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FactorElements_6(vtkXMLDataElement id0);
  public void FactorElements(vtkXMLDataElement id0)
  {
    FactorElements_6(id0);
  }

  private native void UnFactorElements_7(vtkXMLDataElement id0);
  public void UnFactorElements(vtkXMLDataElement id0)
  {
    UnFactorElements_7(id0);
  }

  public vtkXMLUtilities() { super(); }

  public vtkXMLUtilities(long id) { super(id); }
  public native long   VTKInit();

}
