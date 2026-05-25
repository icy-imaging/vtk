// java wrapper for vtkOutlineSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOutlineSource extends vtkPolyDataAlgorithm
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

  private native void SetBoxType_4(int id0);
  public void SetBoxType(int id0)
  {
    SetBoxType_4(id0);
  }

  private native int GetBoxType_5();
  public int GetBoxType()
  {
    return GetBoxType_5();
  }

  private native void SetBoxTypeToAxisAligned_6();
  public void SetBoxTypeToAxisAligned()
  {
    SetBoxTypeToAxisAligned_6();
  }

  private native void SetBoxTypeToOriented_7();
  public void SetBoxTypeToOriented()
  {
    SetBoxTypeToOriented_7();
  }

  private native void SetBounds_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_9(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_9(id0);
  }

  private native double[] GetBounds_10();
  public double[] GetBounds()
  {
    return GetBounds_10();
  }

  private native double[] GetCorners_11();
  public double[] GetCorners()
  {
    return GetCorners_11();
  }

  private native void SetGenerateFaces_12(int id0);
  public void SetGenerateFaces(int id0)
  {
    SetGenerateFaces_12(id0);
  }

  private native void GenerateFacesOn_13();
  public void GenerateFacesOn()
  {
    GenerateFacesOn_13();
  }

  private native void GenerateFacesOff_14();
  public void GenerateFacesOff()
  {
    GenerateFacesOff_14();
  }

  private native int GetGenerateFaces_15();
  public int GetGenerateFaces()
  {
    return GetGenerateFaces_15();
  }

  private native void SetOutputPointsPrecision_16(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_16(id0);
  }

  private native int GetOutputPointsPrecision_17();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_17();
  }

  public vtkOutlineSource() { super(); }

  public vtkOutlineSource(long id) { super(id); }
  public native long   VTKInit();

}
