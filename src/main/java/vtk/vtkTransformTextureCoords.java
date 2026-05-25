// java wrapper for vtkTransformTextureCoords object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformTextureCoords extends vtkDataSetAlgorithm
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

  private native void SetPosition_4(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_4(id0,id1,id2);
  }

  private native void SetPosition_5(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_5(id0);
  }

  private native double[] GetPosition_6();
  public double[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void AddPosition_7(double id0,double id1,double id2);
  public void AddPosition(double id0,double id1,double id2)
  {
    AddPosition_7(id0,id1,id2);
  }

  private native void AddPosition_8(double id0[]);
  public void AddPosition(double id0[])
  {
    AddPosition_8(id0);
  }

  private native void SetScale_9(double id0,double id1,double id2);
  public void SetScale(double id0,double id1,double id2)
  {
    SetScale_9(id0,id1,id2);
  }

  private native void SetScale_10(double id0[]);
  public void SetScale(double id0[])
  {
    SetScale_10(id0);
  }

  private native double[] GetScale_11();
  public double[] GetScale()
  {
    return GetScale_11();
  }

  private native void SetOrigin_12(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_12(id0,id1,id2);
  }

  private native void SetOrigin_13(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_13(id0);
  }

  private native double[] GetOrigin_14();
  public double[] GetOrigin()
  {
    return GetOrigin_14();
  }

  private native void SetFlipR_15(int id0);
  public void SetFlipR(int id0)
  {
    SetFlipR_15(id0);
  }

  private native int GetFlipR_16();
  public int GetFlipR()
  {
    return GetFlipR_16();
  }

  private native void FlipROn_17();
  public void FlipROn()
  {
    FlipROn_17();
  }

  private native void FlipROff_18();
  public void FlipROff()
  {
    FlipROff_18();
  }

  private native void SetFlipS_19(int id0);
  public void SetFlipS(int id0)
  {
    SetFlipS_19(id0);
  }

  private native int GetFlipS_20();
  public int GetFlipS()
  {
    return GetFlipS_20();
  }

  private native void FlipSOn_21();
  public void FlipSOn()
  {
    FlipSOn_21();
  }

  private native void FlipSOff_22();
  public void FlipSOff()
  {
    FlipSOff_22();
  }

  private native void SetFlipT_23(int id0);
  public void SetFlipT(int id0)
  {
    SetFlipT_23(id0);
  }

  private native int GetFlipT_24();
  public int GetFlipT()
  {
    return GetFlipT_24();
  }

  private native void FlipTOn_25();
  public void FlipTOn()
  {
    FlipTOn_25();
  }

  private native void FlipTOff_26();
  public void FlipTOff()
  {
    FlipTOff_26();
  }

  public vtkTransformTextureCoords() { super(); }

  public vtkTransformTextureCoords(long id) { super(id); }
  public native long   VTKInit();

}
