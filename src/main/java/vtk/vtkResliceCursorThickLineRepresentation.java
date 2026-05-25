// java wrapper for vtkResliceCursorThickLineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorThickLineRepresentation extends vtkResliceCursorLineRepresentation
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

  private native void CreateDefaultResliceAlgorithm_4();
  public void CreateDefaultResliceAlgorithm()
  {
    CreateDefaultResliceAlgorithm_4();
  }

  private native void SetResliceParameters_5(double id0,double id1,int id2,int id3);
  public void SetResliceParameters(double id0,double id1,int id2,int id3)
  {
    SetResliceParameters_5(id0,id1,id2,id3);
  }

  public vtkResliceCursorThickLineRepresentation() { super(); }

  public vtkResliceCursorThickLineRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
