// java wrapper for vtkBlueObeliskDataParser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBlueObeliskDataParser extends vtkXMLParser
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

  private native void SetTarget_4(vtkBlueObeliskData id0);
  public void SetTarget(vtkBlueObeliskData id0)
  {
    SetTarget_4(id0);
  }

  private native int Parse_5();
  public int Parse()
  {
    return Parse_5();
  }

  private native int Parse_6(byte[] id0, int len0);
  public int Parse(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Parse_6(bytes0, bytes0.length);
  }

  private native int Parse_7(byte[] id0, int len0,int id1);
  public int Parse(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Parse_7(bytes0, bytes0.length,id1);
  }

  public vtkBlueObeliskDataParser() { super(); }

  public vtkBlueObeliskDataParser(long id) { super(id); }
  public native long   VTKInit();

}
