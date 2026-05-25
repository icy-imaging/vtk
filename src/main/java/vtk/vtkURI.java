// java wrapper for vtkURI object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkURI extends vtkObject
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

  private native byte[] PercentEncode_4(byte[] id0, int len0);
  public String PercentEncode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(PercentEncode_4(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native byte[] PercentDecode_5(byte[] id0, int len0);
  public String PercentDecode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(PercentDecode_5(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native boolean IsReference_6();
  public boolean IsReference()
  {
    return IsReference_6();
  }

  private native boolean IsRelative_7();
  public boolean IsRelative()
  {
    return IsRelative_7();
  }

  private native boolean IsAbsolute_8();
  public boolean IsAbsolute()
  {
    return IsAbsolute_8();
  }

  private native boolean IsFull_9();
  public boolean IsFull()
  {
    return IsFull_9();
  }

  private native boolean IsSameDocRef_10();
  public boolean IsSameDocRef()
  {
    return IsSameDocRef_10();
  }

  private native boolean IsEmpty_11();
  public boolean IsEmpty()
  {
    return IsEmpty_11();
  }

  private native byte[] ToString_12();
  public String ToString()
  {
    return new String(ToString_12(), StandardCharsets.UTF_8);
  }

  public vtkURI() { super(); }

  public vtkURI(long id) { super(id); }
  public native long   VTKInit();

}
